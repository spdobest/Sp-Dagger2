package spit.spdagger2.simpleexample2;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    @Provides
    EngineInterface provideEngine(DieselEngine dieselEngine){
        return dieselEngine;
    }
}