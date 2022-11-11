package `in`.swiggy.myapplication

import dagger.Module
import dagger.android.ContributesAndroidInjector
import `in`.swiggy.feature_a.FeatureAModule
import javax.inject.Singleton

@Module
abstract class ApplicationModule {
    @ContributesAndroidInjector(modules = [FeatureAModule::class])
    abstract fun mainActivty(): MainActivity
}