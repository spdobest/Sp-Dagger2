package spit.spdagger2.otherExample.di.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import spit.spdagger2.app.MyApplication;
import spit.spdagger2.otherExample.DataManager;
import spit.spdagger2.otherExample.DbHelper;
import spit.spdagger2.otherExample.SharedPrefsHelper;
import spit.spdagger2.otherExample.di.ApplicationContext;
import spit.spdagger2.otherExample.di.module.ApplicationModule;


/**
 * Created by janisharali on 08/12/16.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MyApplication demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();

}