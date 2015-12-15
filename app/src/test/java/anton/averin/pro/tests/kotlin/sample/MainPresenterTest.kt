package anton.averin.pro.tests.kotlin.sample

import anton.averin.pro.tests.kotlin.sample.mvp.presenters.MainPresenter
import anton.averin.pro.tests.kotlin.sample.mvp.usecases.SampleUseCase
import anton.averin.pro.tests.kotlin.sample.mvp.views.MainView
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import org.mockito.Mockito.`when`
import rx.Observable


class MainPresenterTest {

    lateinit var presenter: MainPresenter

    lateinit var view: MainView
    lateinit var useCase: SampleUseCase

    @Before
    public fun setup() {
        view = mock(MainView::class.java)
        useCase = mock(SampleUseCase::class.java)
        `when`(useCase.getDataForCase()).thenReturn(Observable.empty())

        presenter = MainPresenter()
        presenter.view = view
        presenter.useCase = useCase
    }

    @Test
    public fun clickingFabCallsUsecase() {
        presenter.fabClicked()
        verify(useCase).getDataForCase()
    }

}


