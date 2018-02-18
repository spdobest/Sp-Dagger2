package spit.spdagger2.module;


import dagger.Module;
import dagger.Provides;
import retrofit.Retrofit;
import spit.spdagger2.network.GitHubApiInterface;
import spit.spdagger2.scope.UserScope;

@Module
public class GitHubModule {

    @Provides
    @UserScope
    public GitHubApiInterface providesGitHubInterface(Retrofit retrofit) {
        return retrofit.create(GitHubApiInterface.class);
    }
}