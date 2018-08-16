package spit.spdagger2.spdagger2.models;

import javax.inject.Singleton;

/**
 * Created by root on 8/16/18.
 */

@Singleton
public class TeamA implements House{
    @Override
    public void prepareforWar() {
        System.out.println("Prepare War in TEAM a");
    }
}
