package spit.spdagger2.kotlinmvpdagger2.ui.main

import spit.spdagger2.kotlinmvpdagger2.ui.base.BaseContract

class MainContract {

    interface View: BaseContract.View {
        fun showAboutFragment()
        fun showListFragment()
    }

    interface Presenter: BaseContract.Presenter<MainContract.View> {
        fun onDrawerOptionAboutClick()
    }
}