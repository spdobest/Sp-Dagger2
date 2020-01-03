package spit.spdagger2.githubExample.di.component;

import dagger.Component;
import spit.spdagger2.githubExample.GithubActivity;
import spit.spdagger2.githubExample.di.module.GitHubModule;
import spit.spdagger2.githubExample.di.scope.UserScope;

@UserScope
@Component(dependencies = GithubNetComponent.class, modules = GitHubModule.class)
public interface GitHubComponent {
    void inject(GithubActivity activity);
}

