package spit.spdagger2.main.kotlinexample.di.modules

import dagger.Module
import dagger.Provides
import spit.spdagger2.main.kotlinexample.api.ApiServiceInterface
import spit.spdagger2.main.kotlinexample.ui.about.AboutContract
import spit.spdagger2.main.kotlinexample.ui.about.AboutPresenter
import spit.spdagger2.main.kotlinexample.ui.list.ListContract
import spit.spdagger2.main.kotlinexample.ui.list.ListPresenter

@Module
class FragmentModule {

    @Provides
    fun provideAboutPresenter(): AboutContract.Presenter {
        return AboutPresenter()
    }

    @Provides
    fun provideListPresenter(): ListContract.Presenter {
        return ListPresenter()
    }

    @Provides
    fun provideApiService(): ApiServiceInterface {
        return ApiServiceInterface.create()
    }
}