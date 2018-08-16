package spit.spdagger2.dagger2New

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import spit.spdagger2.R

// https://www.raywenderlich.com/262-dependency-injection-in-android-with-dagger-2-and-kotlin
class Dagger2NewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger2_new)
    }
}
