package com.mohamadamin.cleantvmaze.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mohamadamin.cleantvmaze.app.AppController
import com.mohamadamin.cleantvmaze.base.di.ApplicationComponent

/**
 * @author MohamadAmin Mohamadi (mohammadi.mohamadamin@gmail.com) on 5/6/17.
 */
abstract class BaseActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        injectDependencies(AppController.applicationComponent)
        super.onCreate(savedInstanceState)
    }

    protected abstract fun injectDependencies(applicationComponent: ApplicationComponent)

}