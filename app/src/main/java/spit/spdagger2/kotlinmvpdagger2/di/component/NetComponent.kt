package spit.spdagger2.kotlinmvpdagger2.di.component


import android.content.SharedPreferences
import com.squareup.okhttp.OkHttpClient
import dagger.Component
import retrofit.Retrofit
import spit.spdagger2.kotlinmvpdagger2.BaseApp
import spit.spdagger2.kotlinmvpdagger2.di.modules.AppModule
import spit.spdagger2.kotlinmvpdagger2.di.modules.NetModule
import spit.spdagger2.kotlinmvpdagger2.ui.main.MainActivity
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