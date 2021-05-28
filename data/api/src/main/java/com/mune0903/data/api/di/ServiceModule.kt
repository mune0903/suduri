package com.mune0903.data.api.di

import com.mune0903.data.api.service.ItemService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {

    @Provides
    @Singleton
    fun provideItemService(retrofit: Retrofit): ItemService {
        return retrofit.create(ItemService::class.java)
    }
}