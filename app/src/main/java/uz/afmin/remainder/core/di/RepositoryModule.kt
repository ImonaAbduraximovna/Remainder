package uz.afmin.remainder.core.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.afmin.remainder.core.db.TaskCategoryDao
import uz.afmin.remainder.core.repo.TaskCategoryRepository
import uz.afmin.remainder.core.repo.TaskCategoryRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideTaskCategoryRepository(taskCategoryDao: TaskCategoryDao): TaskCategoryRepository {
        return TaskCategoryRepositoryImpl(taskCategoryDao)
    }
}