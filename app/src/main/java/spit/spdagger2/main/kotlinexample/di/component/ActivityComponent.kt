package spit.spdagger2.main.kotlinexample.di.component

import dagger.Component
import spit.spdagger2.main.kotlinexample.di.modules.ActivityModule
import spit.spdagger2.main.kotlinexample.ui.main.MainActivity

@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)


}