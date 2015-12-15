package anton.averin.pro.tests.kotlin.sample.mvp.presenters

import anton.averin.pro.tests.kotlin.sample.ui.BaseActivity

open class PresentedActivity<T> : BaseActivity()
        where T : BasePresenter {

    private var presenter: T? = null

    public fun initPresenter(presenter: T) {
        this.presenter = presenter
        presenter.onCreate()
    }

    override fun onResume() {
        super.onResume()
        presenter?.onResume()
    }

    override fun onPause() {
        super.onPause()
        presenter?.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter?.onDestroy()
    }

}
