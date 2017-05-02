package com.mohamadamin.cleantvmaze.data

import com.google.gson.Gson
import com.mohamadamin.cleantvmaze.data.executor.ExecutorModule
import com.mohamadamin.cleantvmaze.data.interactor.UseCaseModule
import com.mohamadamin.cleantvmaze.data.network.NetworkModule
import com.mohamadamin.cleantvmaze.data.repository.RepositoryModule
import com.mohamadamin.cleantvmaze.database.DatabaseModule
import com.mohamadamin.cleantvmaze.domain.interactor.GetShowDetailUseCase
import com.mohamadamin.cleantvmaze.domain.interactor.GetShowsUseCase
import dagger.Component
import easymvp.executer.PostExecutionThread
import easymvp.executer.UseCaseExecutor

/**
 * @author MohamadAmin Mohamadi (mohammadi.mohamadamin@gmail.com) on 5/3/17.
 */
@Component(modules = arrayOf(
        ExecutorModule::class,
        UseCaseModule::class,
        DatabaseModule::class,
        NetworkModule::class,
        RepositoryModule::class
))
interface DataLayerComponent {

    fun provideGetShowsUseCase(): GetShowsUseCase

    fun provideGetShowDetailUseCase(): GetShowDetailUseCase

    fun proivdeUseCaseExecutor(): UseCaseExecutor

    fun providePostExecutionThread(): PostExecutionThread

    fun provideGson(): Gson

}