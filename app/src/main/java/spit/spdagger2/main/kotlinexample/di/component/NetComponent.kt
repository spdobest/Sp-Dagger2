package spit.spdagger2.main.kotlinexample.di.component


import dagger.Component
import spit.spdagger2.main.kotlinexample.di.modules.AppModule
import spit.spdagger2.main.kotlinexample.di.modules.NetModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class, NetModule::class))
interface NetComponent {

//    fun inject(application: MainActivity)

    // downstream components need these exposed

   /* fun retrofit(): Retrofit?

    fun okHttpClient(): OkHttpClient?

    fun sharedPreferences(): SharedPreferences?*/
}