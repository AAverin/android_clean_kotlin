package anton.averin.pro.tests.kotlin.sample.data

import rx.Observable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RepositoryImpl @Inject constructor(): Repository {
    override fun doSampleRequest() : Observable<String> {
        return Observable.just("Hello Reactive World!")
    }

}