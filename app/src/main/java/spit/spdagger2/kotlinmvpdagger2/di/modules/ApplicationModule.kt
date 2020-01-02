package spit.spdagger2.kotlinmvpdagger2.di.modules

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import io.reactivex.annotations.Nullable
import spit.spdagger2.kotlinmvpdagger2.BaseApp
import spit.spdagger2.kotlinmvpdagger2.di.DatabaseInfo
import spit.spdagger2.kotlinmvpdagger2.di.scopes.PerApplication
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