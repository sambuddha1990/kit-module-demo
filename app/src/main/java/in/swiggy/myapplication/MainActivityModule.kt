package `in`.swiggy.myapplication

import dagger.Module
import dagger.android.ContributesAndroidInjector
import `in`.swiggy.feature_a.FeatureAModule
import `in`.swiggy.feature_b.FeatureBScreen

@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector (modules = [FeatureAModule::class])
    abstract fun featureBScreen(): FeatureBScreen
}