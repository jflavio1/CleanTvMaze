package com.mohamadamin.cleantvmaze.page.main

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.mohamadamin.cleantvmaze.R
import com.mohamadamin.cleantvmaze.base.BaseActivity
import com.mohamadamin.cleantvmaze.base.di.ApplicationComponent
import com.mohamadamin.cleantvmaze.domain.entity.Show
import easymvp.annotation.ActivityView
import easymvp.annotation.Presenter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import javax.inject.Inject

@ActivityView(presenter = MainPresenter::class, layout = R.layout.activity_main)
class MainActivity : BaseActivity(), NavigationView.OnNavigationItemSelectedListener, MainView {

    @Inject
    @Presenter
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupToolbar()
    }

    override fun injectDependencies(applicationComponent: ApplicationComponent) {
        applicationComponent.injectTo(this)
    }

    override fun showShows(shows: List<Show>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showNetworkError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showLoadingShows() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /**
     * Function for:
     * Setting [toolbar] instead of [android.support.v7.app.ActionBar],
     * Creating a [ActionBarDrawerToggle] in [toolbar] as drawer layout's listener,
     * Setting [nav_view]'s item click listener.
     */
    fun setupToolbar() {
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    /**
     * This function closes the [drawer_layout] if it is open
     * before leaving the activity
     */
    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    /** @inheritdoc */
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    /** @inheritdoc */
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId

        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }

    /** @inheritdoc */
    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        // Handle navigation view item clicks here.
        val id = item.itemId

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true

    }
}