package spit.spdagger2.spdagger2.models;

import android.content.SharedPreferences;

import com.google.gson.Gson;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Omar on 18/02/2017.
 */
@Singleton
public class ObjectManager {
    private SharedPreferences sharedPreferences;
    private Gson gson;

    @Inject
    public ObjectManager(SharedPreferences sharedPreferences, Gson gson) {
        this.sharedPreferences = sharedPreferences;
        this.gson = gson;
    }

    public void save(String key, Object o){
        sharedPreferences.edit()
                .putString(key, gson.toJson(o))
                .apply();
    }

    public <T> T get(String key, Class<T> type){
        String json = sharedPreferences.getString(key, null);
        if(json == null){
            return null;
        }

        return gson.fromJson(json, type);
    }
}