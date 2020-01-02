package spit.spdagger2.main.otherexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import retrofit2.Retrofit
import spit.spdagger2.R
import spit.spdagger2.main.otherexample.di.*
import javax.inject.Inject


class OtherActivity : AppCompatActivity() {



    @Inject lateinit var retrofit: Retrofit

    @set:Inject
    lateinit var prefsHelper: SharedPrefsHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        injectDependency()

        prefsHelper?.put("siba", "Sibaprasad Mohanty")

        Toast.makeText(this, prefsHelper?.get("siba", ""), Toast.LENGTH_SHORT).show()

    }


    private fun getHeroes() {

    }

    private fun injectDependency() {
         val mApiComponent = DaggerApiComponent.builder()
                 .appModuleJava(AppModuleJava(this))
                 .apiModule(ApiModule("https://simplifiedcoding.net/demos/"))
                 .sharedPreferencesModule(SharedPreferencesModule(this))
                 .build()
    }

}
