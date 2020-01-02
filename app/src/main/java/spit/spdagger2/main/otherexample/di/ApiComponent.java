package spit.spdagger2.main.otherexample.di;

import javax.inject.Singleton;

import dagger.Component;
import spit.spdagger2.main.otherexample.OtherActivity;


@Singleton
@Component(modules = {AppModuleJava.class, ApiModule.class,SharedPreferencesModule.class})
public interface ApiComponent {
    void inject(OtherActivity activity);
}