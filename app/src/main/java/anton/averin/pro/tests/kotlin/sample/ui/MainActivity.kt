package anton.averin.pro.tests.kotlin.sample.ui

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import anton.averin.pro.tests.kotlin.sample.R
import anton.averin.pro.tests.kotlin.sample.SampleApplication
import anton.averin.pro.tests.kotlin.sample.mvp.presenters.MainPresenter
import anton.averin.pro.tests.kotlin.sample.mvp.presenters.PresentedActivity
import anton.averin.pro.tests.kotlin.sample.mvp.views.MainView
import butterknife.bindView
import javax.inject.Inject

class MainActivity : PresentedActivity<MainPresenter>(), MainView {


    @Inject
    lateinit var presenter: MainPresenter

    val toolbar: Toolbar by bindView(R.id.toolbar)
    val fab: FloatingActionButton by bindView(R.id.fab)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as SampleApplication).graph.inject(this)
        presenter.view = this
        initPresenter(presenter)

        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            presenter.fabClicked();
        }
    }

    override fun showMessage() {
        Snackbar.make(fab, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}
