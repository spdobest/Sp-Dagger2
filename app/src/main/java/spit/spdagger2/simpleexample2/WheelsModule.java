package spit.spdagger2.simpleexample2;

import dagger.Module;
import dagger.Provides;


/**
 * This is used only for module and provide example
 *
 */
@Module
public class WheelsModule {

    @Provides
    Rims provideRims(){
        return new Rims();
    }

    @Provides
    Tyres provideTyres(){
        Tyres tyres =  new Tyres();
        tyres.showMessage();
        return tyres;
    }

    @Provides
    Wheels provideWheels(Rims rims,Tyres tyres){
        return new Wheels(rims,tyres);
    }

}
