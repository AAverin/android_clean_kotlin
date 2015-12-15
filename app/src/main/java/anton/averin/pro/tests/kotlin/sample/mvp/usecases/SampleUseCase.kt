package anton.averin.pro.tests.kotlin.sample.mvp.usecases

import rx.Observable

interface SampleUseCase {
    fun getDataForCase(): Observable<String>
}