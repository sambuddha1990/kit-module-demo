package `in`.swiggy.myapplication

import android.os.Bundle
import dagger.MembersInjector
import dagger.android.DaggerActivity
import `in`.swiggy.feature_b.FeatureBScreen
import `in`.swiggy.feature_c.FeatureCScreen
import javax.inject.Inject

class MainActivity : DaggerActivity() {

    @Inject
    lateinit var injectorB: MembersInjector<FeatureBScreen>

    @Inject
    lateinit var injectorC: MembersInjector<FeatureCScreen>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val featureBScreen = FeatureBScreen()
        injectorB.injectMembers(featureBScreen)
        featureBScreen.navigateToA()
        val featureCScreen = FeatureCScreen()
        injectorC.injectMembers(featureCScreen)
        featureCScreen.navigateToA()
    }
}