package spit.spdagger2.main.otherexample.di;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class SharedPreferencesModule {

    private Context context;

    public SharedPreferencesModule(Context context) {
        this.context = context;
    }

    @Provides
    SharedPrefsHelper provideSharedPreferences() {
        return new SharedPrefsHelper(context.getSharedPreferences("PrefName", Context.MODE_PRIVATE));
    }
}