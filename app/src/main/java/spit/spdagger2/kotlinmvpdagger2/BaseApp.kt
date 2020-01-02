package spit.spdagger2.kotlinmvpdagger2

import android.app.Application
import spit.spdagger2.BuildConfig
import spit.spdagger2.kotlinmvpdagger2.di.component.ApplicationComponent
import spit.spdagger2.kotlinmvpdagger2.di.component.DaggerApplicationComponent
import spit.spdagger2.kotlinmvpdagger2.di.modules.ApplicationModule

class BaseApp: Application() {

    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        instance = this
        setup()

        if (BuildConfig.DEBUG) {
            // Maybe TimberPlant etc.
        }
    }

    fun setup() {
        component = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this)).build()
        component.inject(this)
    }

    fun getApplicationComponent(): ApplicationComponent {
        return component
    }

    companion object {
        lateinit var instance: BaseApp private set
    }
}