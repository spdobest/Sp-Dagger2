package spit.spdagger2.simpleexample2;


import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;
    private EngineInterface engineInterface;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public Car(EngineInterface engineInterface, Wheels wheels) {
        this.engineInterface = engineInterface;
        this.wheels = wheels;
    }

    public void drive() {
        engineInterface.start();
        Log.d(TAG, "driving...");
    }

    /**
     * Field Injection
     * we created Remote class for field Injection
     * This method must be Public
     */
    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }
}