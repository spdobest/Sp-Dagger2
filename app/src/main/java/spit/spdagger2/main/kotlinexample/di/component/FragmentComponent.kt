package spit.spdagger2.main.kotlinexample.di.component

import dagger.Component
import spit.spdagger2.main.kotlinexample.di.modules.FragmentModule
import spit.spdagger2.main.kotlinexample.ui.about.AboutFragment
import spit.spdagger2.main.kotlinexample.ui.list.ListFragment

@Component(modules = arrayOf(FragmentModule::class))
interface FragmentComponent {

    fun inject(aboutFragment: AboutFragment)

    fun inject(listFragment: ListFragment)

}