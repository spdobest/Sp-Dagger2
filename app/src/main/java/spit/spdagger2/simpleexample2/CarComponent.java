package spit.spdagger2.simpleexample2;

import javax.inject.Inject;

import dagger.Component;

@Component(modules = {WheelsModule.class,PetrolEngineModule.class}) // this is example of Module
public interface CarComponent {
    Car getCar();

    void Inject(SimpleActivity2 simpleActivity2);  // we cant declare Super class of SimpleActivity2

}
