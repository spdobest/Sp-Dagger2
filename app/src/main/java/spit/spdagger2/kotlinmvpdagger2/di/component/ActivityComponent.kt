package spit.spdagger2.kotlinmvpdagger2.di.component

import dagger.Component
import spit.spdagger2.kotlinmvpdagger2.di.modules.ActivityModule
import spit.spdagger2.kotlinmvpdagger2.di.modules.NetModule
import spit.spdagger2.kotlinmvpdagger2.ui.main.MainActivity

@Component(modules = arrayOf(ActivityModule::class/*, NetModule::class*/))
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

}