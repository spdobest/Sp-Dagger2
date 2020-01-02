package spit.spdagger2.main.kotlinexample.di.component

import dagger.Component
import spit.spdagger2.main.BaseApp
import spit.spdagger2.main.kotlinexample.di.modules.ApplicationModule


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