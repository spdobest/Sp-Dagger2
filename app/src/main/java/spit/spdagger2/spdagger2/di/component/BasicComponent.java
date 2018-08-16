package spit.spdagger2.spdagger2.di.component;

import javax.inject.Singleton;

import dagger.Component;
import spit.spdagger2.spdagger2.SpDagger2Activity;
import spit.spdagger2.spdagger2.di.module.AppModule;

/**
 * Created by Omar on 18/02/2017.
 */
@Singleton
@Component (modules = {AppModule.class})
public interface BasicComponent {
    void inject(SpDagger2Activity activity);
}