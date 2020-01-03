package spit.spdagger2.githubExample.di.component;

import com.squareup.okhttp.OkHttpClient;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;
import retrofit.Retrofit;
import spit.spdagger2.githubExample.di.module.GithubAppModule;
import spit.spdagger2.githubExample.di.module.GithubNetModule;

@Singleton
@Component(modules={GithubAppModule.class, GithubNetModule.class})
public interface GithubNetComponent {
    // downstream components need these exposed
    Retrofit retrofit();
    OkHttpClient okHttpClient();
    SharedPreferences sharedPreferences();
}