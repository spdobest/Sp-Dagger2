package spit.spdagger2.kotlinmvpdagger2.di.modules

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    var mApplication: Application? = null

    fun AppModule(application: Application?) {
        mApplication = application
    }

    @Provides
    @Singleton
    fun providesApplication(): Application? {
        return mApplication
    }
}