package spit.spdagger2.githubExample.di.module;


import dagger.Module;
import dagger.Provides;
import retrofit.Retrofit;
import spit.spdagger2.githubExample.di.scope.UserScope;
import spit.spdagger2.githubExample.network.GitHubApiInterface;

@Module
public class GitHubModule {

    @Provides
    @UserScope
    public GitHubApiInterface providesGitHubInterface(Retrofit retrofit) {
        return retrofit.create(GitHubApiInterface.class);
    }
}