package spit.spdagger2.spdagger2.di;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MySingleton {
    @Inject
    Context context;
    @Inject MyOtherSingleton myOtherSingleton;

    @Inject
    public MySingleton() {
    }
}