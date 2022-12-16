package uz.afmin.remainder.core.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.FragmentScoped
import uz.afmin.remainder.core.adapter.TasksAdapter
import javax.inject.Named

@Module
@InstallIn(FragmentComponent::class)
object FragmentAdapterModule {
    @Provides
    @FragmentScoped
    @Named("task_category_fragment")
    fun provideTaskAdapterToTaskCategoryFragment() = TasksAdapter()
}