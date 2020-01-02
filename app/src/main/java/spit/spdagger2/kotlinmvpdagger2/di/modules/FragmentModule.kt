package spit.spdagger2.kotlinmvpdagger2.di.modules

import dagger.Module
import dagger.Provides
import spit.spdagger2.kotlinmvpdagger2.api.ApiServiceInterface
import spit.spdagger2.kotlinmvpdagger2.ui.about.AboutContract
import spit.spdagger2.kotlinmvpdagger2.ui.about.AboutPresenter
import spit.spdagger2.kotlinmvpdagger2.ui.list.ListContract
import spit.spdagger2.kotlinmvpdagger2.ui.list.ListPresenter

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