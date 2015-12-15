package anton.averin.pro.tests.kotlin.sample.mvp.presenters

import anton.averin.pro.tests.kotlin.sample.mvp.views.BaseView

interface BasePresenter {
    val view: BaseView?

    open fun onCreate() {
        //override for implementation
    }

    open fun onPause() {
        //override for implementation
    }

    open fun onResume() {
        //override for implementation
    }

    open fun onDestroy() {
        //override for implementation
    }
}

