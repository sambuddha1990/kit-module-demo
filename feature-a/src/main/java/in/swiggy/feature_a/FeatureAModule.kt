package `in`.swiggy.feature_a

import dagger.Binds
import dagger.Module
import `in`.swiggy.feature_a_kit.IFeatureANavigator
import javax.inject.Singleton

@Module
interface FeatureAModule {
    @Binds
    fun bindsFeatureANavigator(navigator: FeatureANavigator): IFeatureANavigator
}