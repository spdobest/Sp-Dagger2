package spit.spdagger2.spdagger2

import android.content.Context
import javax.inject.Singleton

/**
 * Created by root on 8/16/18.
 */
@Singleton
public class MyPreference{

    lateinit var context:Context

    constructor(context:Context){
        this.context = context
    }
}