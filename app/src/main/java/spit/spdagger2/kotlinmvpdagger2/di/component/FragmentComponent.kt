package spit.spdagger2.kotlinmvpdagger2.di.component

import dagger.Component
import spit.spdagger2.kotlinmvpdagger2.di.modules.FragmentModule
import spit.spdagger2.kotlinmvpdagger2.ui.about.AboutFragment
import spit.spdagger2.kotlinmvpdagger2.ui.list.ListFragment

@Component(modules = arrayOf(FragmentModule::class))
interface FragmentComponent {

    fun inject(aboutFragment: AboutFragment)

    fun inject(listFragment: ListFragment)

}