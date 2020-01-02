package spit.spdagger2.simpleexample2;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements EngineInterface {

    private static final String TAG = "Car";


    @Inject
    public PetrolEngine(){

    }

    @Override
    public void start() {
        Log.i(TAG, "Petrol Engine Started ");
    }
}
