package `in`.swiggy.feature_b

import `in`.swiggy.feature_a_kit.IFeatureANavigator
import javax.inject.Inject

class FeatureBScreen {

    @Inject
    lateinit var navigator : IFeatureANavigator

    fun navigateToA() {
        navigator.navigateToAScreen(false)
    }

}