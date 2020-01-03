package spit.spdagger2.githubExample.network;


import java.util.ArrayList;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import spit.spdagger2.model.Repository;

public interface GitHubApiInterface {
    @GET("/users/{user}/repos")
    Call<ArrayList<Repository>> getRepository(@Path("user") String userName);

}