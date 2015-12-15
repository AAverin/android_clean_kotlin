package anton.averin.pro.tests.kotlin.sample.mvp.presenters

import android.util.Log
import anton.averin.pro.tests.kotlin.sample.mvp.usecases.SampleUseCase
import anton.averin.pro.tests.kotlin.sample.mvp.views.MainView
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainPresenter @Inject constructor(): BasePresenter {

    @Inject
    lateinit var useCase: SampleUseCase

    override var view: MainView? = null

    fun fabClicked() {
        useCase.getDataForCase().subscribe {
            Log.d("TEST", it)
        }
    }

}
