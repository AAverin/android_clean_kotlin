package anton.averin.pro.tests.kotlin.sample

import anton.averin.pro.tests.kotlin.sample.data.Repository
import anton.averin.pro.tests.kotlin.sample.mvp.usecases.SampleUseCaseImpl
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import org.mockito.Mockito.`when`
import rx.Observable

class SampleUseCaseTest {

    lateinit var useCase: SampleUseCaseImpl
    lateinit var repository: Repository

    @Before
    public fun setup() {
        repository = mock(Repository::class.java)
        `when`(repository.doSampleRequest()).thenReturn(Observable.empty())

        useCase = SampleUseCaseImpl()
        useCase.repository = repository
    }

    @Test
    public fun getDataForCaseCallsRepository() {
        useCase.getDataForCase().subscribe()
        verify(repository).doSampleRequest()
    }


}


