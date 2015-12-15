package anton.averin.pro.tests.kotlin.sample.di

import anton.averin.pro.tests.kotlin.sample.BaseApplication
import anton.averin.pro.tests.kotlin.sample.data.Repository
import anton.averin.pro.tests.kotlin.sample.data.RepositoryImpl
import anton.averin.pro.tests.kotlin.sample.mvp.usecases.SampleUseCase
import anton.averin.pro.tests.kotlin.sample.mvp.usecases.SampleUseCaseImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
public class ApplicationModule(private val application: BaseApplication) {

    @Singleton
    @Provides
    fun repository(repository: RepositoryImpl) : Repository {
        return repository
    }

    @Singleton
    @Provides
    fun sampleUsecase(useCase: SampleUseCaseImpl) : SampleUseCase {
        return useCase
    }

}
