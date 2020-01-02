package spit.spdagger2.main.kotlinexample.di.modules

import android.app.Application
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
class NetModule {

    var mBaseUrl: String? = null

    // Constructor needs one parameter to instantiate.
    fun NetModule(baseUrl: String?) {
        mBaseUrl = baseUrl
    }

    // Dagger will only look for methods annotated with @Provides
    @Provides
    @Singleton
    public fun  // Application reference must come from AppModule.class
            providesSharedPreferences(application: Application?): SharedPreferences? {
        return PreferenceManager.getDefaultSharedPreferences(application)
    }

    @Provides
    @Singleton
    public fun provideOkHttpCache(application: Application): Cache? {
        val cacheSize = 10 * 1024 * 1024 // 10 MiB
        return Cache(application.getCacheDir(), cacheSize.toLong())
    }

    @Provides
    @Singleton
    public fun provideGson(): Gson? {
        val gsonBuilder = GsonBuilder()
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        return gsonBuilder.create()
    }

    @Provides
    @Singleton
    public fun provideOkHttpClient(cache: Cache?): OkHttpClient? {
        val client: OkHttpClient.Builder = OkHttpClient.Builder()
        client.cache(cache)
        return client.build()
    }

    @Provides
    @Singleton
    public fun provideRetrofit(gson: Gson?, okHttpClient: OkHttpClient?): Retrofit? {
        return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(mBaseUrl)
                .client(okHttpClient)
                .build()
    }
}