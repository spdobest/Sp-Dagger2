package spit.spdagger2.kotlinmvpdagger2.di.component

import dagger.Component
import spit.spdagger2.kotlinmvpdagger2.BaseApp
import spit.spdagger2.kotlinmvpdagger2.di.modules.AppModule
import spit.spdagger2.kotlinmvpdagger2.di.modules.ApplicationModule
import spit.spdagger2.kotlinmvpdagger2.di.modules.NetModule


@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun inject(application: BaseApp)

/*    @ApplicationContext
    fun getContext(): Context?

    fun getDataManager(): DataManager?

    fun getPreferenceHelper(): SharedPrefsHelper?

    @Singleton
    fun getDbHelper(): DbHelper?

 */

}