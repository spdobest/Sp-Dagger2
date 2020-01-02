package spit.spdagger2.main.kotlinexample.di.modules

import android.app.Application
import dagger.Module
import dagger.Provides
import spit.spdagger2.main.BaseApp
import spit.spdagger2.main.otherexample.di.DatabaseInfo
import spit.spdagger2.main.kotlinexample.di.scopes.PerApplication
import javax.inject.Singleton


@Module
class ApplicationModule(private val baseApp: BaseApp) {

    @Provides
    @Singleton
    @PerApplication
    fun provideApplication(): Application {
        return baseApp
    }



    @Provides
    @DatabaseInfo
    fun provideDatabaseName(): String? {
        return "demo-dagger.db"
    }

    @Provides
    @DatabaseInfo
    fun provideDatabaseVersion(): Int? {
        return 2
    }

   /* @Provides
    @Singleton
    @android.support.annotation.Nullable
    fun provideSharedPrefs(): SharedPreferences? {
        return baseApp.getSharedPreferences("demo-prefs", Context.MODE_PRIVATE)
    }*/
}