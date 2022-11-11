package `in`.swiggy.feature_a

import javax.inject.Inject

class FeatureANavigatorAlt @Inject constructor() {
    fun navigateToAScreen() {
        val screen = FeatureAScreen()
        screen.compute(false)
    }
}