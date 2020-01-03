package spit.spdagger2.githubExample.app;



import android.app.Application;

import spit.spdagger2.githubExample.di.component.DaggerGitHubComponent;
import spit.spdagger2.githubExample.di.component.DaggerGithubNetComponent;
import spit.spdagger2.githubExample.di.component.GitHubComponent;
import spit.spdagger2.githubExample.di.component.GithubNetComponent;
import spit.spdagger2.githubExample.di.module.GithubAppModule;
import spit.spdagger2.githubExample.di.module.GitHubModule;
import spit.spdagger2.githubExample.di.module.GithubNetModule;

public class GithubApplication extends Application {

    private GithubNetComponent mNetComponent;
    private GitHubComponent mGitHubComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        // specify the full namespace of the component
        // Dagger_xxxx (where xxxx = component name)
        mNetComponent = DaggerGithubNetComponent.builder()
                .githubAppModule(new GithubAppModule(this))
                .githubNetModule(new GithubNetModule("https://api.github.com"))
                .build();

        mGitHubComponent = DaggerGitHubComponent.builder()
                .githubNetComponent(mNetComponent)
                .gitHubModule(new GitHubModule())
                .build();

    }

    public GithubNetComponent getNetComponent() {
        return mNetComponent;
    }

    public GitHubComponent getGitHubComponent() {
        return mGitHubComponent;
    }
}