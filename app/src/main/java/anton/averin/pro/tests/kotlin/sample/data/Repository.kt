package anton.averin.pro.tests.kotlin.sample.data

import rx.Observable

interface Repository {
    fun doSampleRequest(): Observable<String>
}