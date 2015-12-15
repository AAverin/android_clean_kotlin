package anton.averin.pro.tests.kotlin.sample

import anton.averin.pro.tests.kotlin.sample.di.ApplicationComponent

public class SampleApplication : BaseApplication() {

    lateinit var graph: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        val graph = initDaggerComponent();
        graph.inject(this);
        this.graph = graph;
    }

}


