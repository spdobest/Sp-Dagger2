package spit.spdagger2.simpleexample2;

import android.util.Log;

import javax.inject.Inject;

public class Remote {

    @Inject
    public Remote( ) {
    }

    public void setListener(Car car){
        Log.i("Remote","Car is under remote control");
    }
}
