package spit.spdagger2.main.kotlinexample.di.modules

import android.app.Activity
import dagger.Module
import dagger.Provides
import spit.spdagger2.main.kotlinexample.ui.main.MainContract
import spit.spdagger2.main.kotlinexample.ui.main.MainPresenter

@Module
class ActivityModule(private var activity: Activity) {

    @Provides
    fun provideActivity(): Activity {
        return activity
    }

    @Provides
    fun providePresenter(): MainContract.Presenter {
        return MainPresenter()
    }

}