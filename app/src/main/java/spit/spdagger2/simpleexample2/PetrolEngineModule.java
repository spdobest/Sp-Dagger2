package spit.spdagger2.simpleexample2;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {

    @Provides
    EngineInterface provideEngine(PetrolEngine petrolEngine){
        return petrolEngine;
    }
}
