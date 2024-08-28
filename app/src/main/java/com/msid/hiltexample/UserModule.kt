package com.msid.hiltexample

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@InstallIn(ActivityComponent::class)
@Module
class UserModule {

    @Provides
    @Named("sql")
    fun provideSQLRepository(sqlRepository: SQLRepository): UserRepository{
        return sqlRepository
    }

    @Provides
    @FirebaseQualifier
    fun provideFirebaseRepository(): UserRepository{
        return Firebaserepository()
    }
}