package com.example.testproject.di

import com.example.testproject.data.repository.ChargerRepository
import com.example.testproject.data.repository.ChargerRepositoryImpl
import com.example.testproject.domain.usecase.GetChargersUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideChargerRepository(): ChargerRepository = ChargerRepositoryImpl()

    @Provides
    @Singleton
    fun provideGetChargersUseCase(repository: ChargerRepository): GetChargersUseCase {
        return GetChargersUseCase(repository)
    }
}