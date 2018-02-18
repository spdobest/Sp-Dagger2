package spit.spdagger2.otherExample.di.component;


import dagger.Component;
import spit.spdagger2.otherExample.DaggerExampleActivity;
import spit.spdagger2.otherExample.di.PerActivity;
import spit.spdagger2.otherExample.di.module.ActivityModule;

/**
 * Created by janisharali on 08/12/16.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(DaggerExampleActivity mainActivity);

}