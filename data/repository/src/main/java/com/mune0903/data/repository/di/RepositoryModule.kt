package com.mune0903.data.repository.di

import com.mune0903.data.repository.ItemRepository
import com.mune0903.data.repository.ItemRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindItemRepository(impl: ItemRepositoryImpl): ItemRepository
}