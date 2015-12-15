package anton.averin.pro.tests.kotlin.sample

import android.app.Application
import anton.averin.pro.tests.kotlin.sample.di.ApplicationComponent
import anton.averin.pro.tests.kotlin.sample.di.ApplicationModule
import anton.averin.pro.tests.kotlin.sample.di.DaggerApplicationComponent

public abstract class BaseApplication : Application() {

    protected fun initDaggerComponent(): ApplicationComponent {
        return DaggerApplicationComponent.builder().applicationModule(ApplicationModule(this)).build();
    }
}


