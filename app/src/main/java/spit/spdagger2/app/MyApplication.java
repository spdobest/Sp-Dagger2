package spit.spdagger2.app;

import android.app.Application;

/**
 * Created by sibaprasad on 18/02/18.
 */

import android.app.Application;

import spit.spdagger2.component.GitHubComponent;
import spit.spdagger2.component.NetComponent;
import spit.spdagger2.module.AppModule;
import spit.spdagger2.module.NetModule;

public class MyApplication extends Application {

    private NetComponent mNetComponent;
    private GitHubComponent mGitHubComponent;

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

    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }

    public GitHubComponent getGitHubComponent() {
        return mGitHubComponent;
    }
}