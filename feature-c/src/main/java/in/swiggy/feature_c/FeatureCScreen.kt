package `in`.swiggy.feature_c

import `in`.swiggy.feature_a.FeatureANavigator
import `in`.swiggy.feature_a_kit.SampleData
import javax.inject.Inject

class FeatureCScreen {
    @Inject
    lateinit var navigator : FeatureANavigator

    fun navigateToA() {
        navigator.navigateToAScreen(SampleData(true))
    }
}