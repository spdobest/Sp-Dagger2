package spit.spdagger2.main

import android.app.Application
import spit.spdagger2.BuildConfig
import spit.spdagger2.main.kotlinexample.di.component.ApplicationComponent
import spit.spdagger2.main.kotlinexample.di.component.DaggerApplicationComponent
import spit.spdagger2.main.kotlinexample.di.modules.ApplicationModule
import spit.spdagger2.main.otherexample.di.*


class BaseApp : Application() {


    /**
     * ********************    LINKS  ***************************
     * https://github.com/phajduk/dagger2-example
     * LATEST VERSION EXAMPLE
     * https://github.com/WeRockStar/Dagger2.git
     * SIMPLE EXAMPLE
     * https://github.com/Kotlin/kotlin-examples/tree/master/gradle/android-dagger/app/src/main
     */

    lateinit var component: ApplicationComponent
    private var mApiComponent: ApiComponent? = null
    override fun onCreate() {
        super.onCreate()

        instance = this
        setup()
       // setupAPIComponent()
        if (BuildConfig.DEBUG) {
            // Maybe TimberPlant etc.
        }
    }

    fun setup() {
        component = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this)).build()
        component.inject(this)
    }

    fun setupAPIComponent() {
        mApiComponent = DaggerApiComponent.builder()
                .appModuleJava(AppModuleJava(this))
                .apiModule(ApiModule("https://simplifiedcoding.net/demos/"))
                .sharedPreferencesModule(SharedPreferencesModule(this))
                .build()
    }

    fun getApplicationComponent(): ApplicationComponent {
        return component
    }

    companion object {
        lateinit var instance: BaseApp private set
    }
}