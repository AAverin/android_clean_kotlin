package anton.averin.pro.tests.kotlin.sample.mvp.usecases

import anton.averin.pro.tests.kotlin.sample.data.Repository
import rx.Observable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SampleUseCaseImpl @Inject constructor(): UseCase(), SampleUseCase {

    @Inject
    lateinit var repository: Repository

    override fun getDataForCase() : Observable<String> {
        return repository.doSampleRequest().map {
            it.plus(" !mapped!")
        }
    }

}

