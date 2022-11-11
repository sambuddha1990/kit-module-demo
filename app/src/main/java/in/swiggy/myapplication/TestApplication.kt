package `in`.swiggy.myapplication

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class TestApplication: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val component = DaggerTestAppComponent.builder().application(this).build()
        component.inject(this)
        return component
    }

}