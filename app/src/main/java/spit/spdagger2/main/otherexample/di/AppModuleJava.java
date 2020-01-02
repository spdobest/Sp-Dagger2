package spit.spdagger2.main.otherexample.di;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModuleJava {
    private Application mApplication;
    private Context mcontext;

    public AppModuleJava(Application mApplication) {
        this.mApplication = mApplication;
    }

    public AppModuleJava(Context mcontext) {
        this.mcontext = mApplication;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @Singleton
    Context provideContext() {
        return mcontext;
    }


}