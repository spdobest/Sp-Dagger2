package spit.spdagger2.spdagger2.di.module;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Omar on 18/02/2017.
 */
@Module
public class AppModule {
    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Singleton @Provides
    public Context provideContext(){
        return context;
    }

    @Singleton @Provides
    public SharedPreferences provideSharedPreferences(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Singleton @Provides
    public Gson provideGson(){
        return new Gson();
    }
}