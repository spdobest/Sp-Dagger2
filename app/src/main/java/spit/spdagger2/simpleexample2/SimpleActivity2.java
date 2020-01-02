package spit.spdagger2.simpleexample2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import spit.spdagger2.R;

public class SimpleActivity2 extends AppCompatActivity {
    private Car car;


//    @Inject private Car car1; ,

    /**
     * Above statement will show compile time error that private fields cant be injecty
     * After that it will show car1 is null here
     * to solve this, define @Inject insideCarComponent like below
     * void Inject(SimpleActivity2 simpleActivity2);
     *
     * the above process known as Field Injection
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.create();

        component.Inject(this);

        car = component.getCar();
        car.drive();
    }
}