package spit.spdagger2.app;

import android.app.Application;
import android.content.Context;

import javax.inject.Inject;

import spit.spdagger2.component.DaggerGitHubComponent;
import spit.spdagger2.component.DaggerNetComponent;
import spit.spdagger2.component.GitHubComponent;
import spit.spdagger2.component.NetComponent;
import spit.spdagger2.module.AppModule;
import spit.spdagger2.module.GitHubModule;
import spit.spdagger2.module.NetModule;
import spit.spdagger2.otherExample.DataManager;
import spit.spdagger2.otherExample.di.component.ApplicationComponent;
import spit.spdagger2.otherExample.di.component.DaggerApplicationComponent;
import spit.spdagger2.otherExample.di.module.ApplicationModule;

/**
 * Created by sibaprasad on 18/02/18.
 */

public class MyApplication extends Application {

    /****
     * FOR OTHER EXAMPLE
     *
     */

    protected ApplicationComponent applicationComponent;
    @Inject
    DataManager dataManager;
    private NetComponent mNetComponent;
    private GitHubComponent mGitHubComponent;

    public static MyApplication get(Context context) {
        return (MyApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        // specify the full namespace of the component
        // Dagger_xxxx (where xxxx = component name)
        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("https://api.github.com"))
                .build();

        mGitHubComponent = DaggerGitHubComponent.builder()
                .netComponent(mNetComponent)
                .gitHubModule(new GitHubModule())
                .build();

        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);

    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }

    public GitHubComponent getGitHubComponent() {
        return mGitHubComponent;
    }

    public ApplicationComponent getComponent() {
        return applicationComponent;
    }
}