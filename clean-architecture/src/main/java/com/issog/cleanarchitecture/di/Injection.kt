package com.issog.cleanarchitecture.di

import com.issog.cleanarchitecture.data.MessageDataSource
import com.issog.cleanarchitecture.data.MessageRepository
import com.issog.cleanarchitecture.domain.IMessageRepository
import com.issog.cleanarchitecture.domain.MessageInteractor
import com.issog.cleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val repository = provideRepository()
        return MessageInteractor(repository)
    }

    private fun provideRepository(): IMessageRepository {
        val dataSource = provideDataSource()
        return MessageRepository(dataSource)
    }

    private fun provideDataSource(): MessageDataSource {
        return MessageDataSource()
    }
}