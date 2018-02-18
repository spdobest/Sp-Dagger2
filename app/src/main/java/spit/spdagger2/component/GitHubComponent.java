package spit.spdagger2.component;


import dagger.Component;
import spit.spdagger2.MainActivity;
import spit.spdagger2.module.GitHubModule;
import spit.spdagger2.scope.UserScope;

@UserScope
@Component(dependencies = NetComponent.class, modules = GitHubModule.class)
public interface GitHubComponent {
    void inject(MainActivity activity);
}