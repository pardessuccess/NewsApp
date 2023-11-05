package com.pardess.newsapp.di

import com.pardess.newsapp.data.manger.LocalUserManagerImpl
import com.pardess.newsapp.data.manger.LocalUserManager
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class ManagerModule {

    @Binds
    @Singleton
    abstract fun bindLocalUserManager(localUserMangerImpl: LocalUserManagerImpl) : LocalUserManager
}