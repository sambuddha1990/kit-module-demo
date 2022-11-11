package `in`.swiggy.feature_a

import android.util.Log
import `in`.swiggy.feature_a_kit.IFeatureANavigator
import javax.inject.Inject

class FeatureANavigator @Inject constructor() : IFeatureANavigator {
    override fun navigateToAScreen(boolean: Boolean) {
        val screen = FeatureAScreen()
        val show = screen.compute(boolean)
        Log.e ("Sambuddha", "$show")
    }
}