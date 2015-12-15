package anton.averin.pro.tests.kotlin.sample.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
public interface ApplicationComponent : ApplicationInjectsTo {

}


