package anton.averin.pro.tests.kotlin.sample.di

import anton.averin.pro.tests.kotlin.sample.SampleApplication
import anton.averin.pro.tests.kotlin.sample.ui.MainActivity

public interface ApplicationInjectsTo {
    fun inject(sampleApplication: SampleApplication)

    fun inject(mainActivity: MainActivity)
}