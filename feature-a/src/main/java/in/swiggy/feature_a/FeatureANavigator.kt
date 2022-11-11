package `in`.swiggy.feature_a

import android.util.Log
import `in`.swiggy.feature_a_kit.IFeatureANavigator
import `in`.swiggy.feature_a_kit.SampleData
import javax.inject.Inject

class FeatureANavigator @Inject constructor() : IFeatureANavigator {
    override fun navigateToAScreen(data: SampleData) {
        val screen = FeatureAScreen()
        val show = screen.compute(data.isAdd)
        Log.e ("Sambuddha", "$show")
    }
}