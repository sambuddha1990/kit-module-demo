package `in`.swiggy.myapplication

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Component (modules = [AndroidInjectionModule::class, ApplicationModule::class])
interface TestAppComponent : AndroidInjector<TestApplication> {

    override fun inject(application: TestApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: TestApplication): Builder
        fun build(): TestAppComponent
    }

}