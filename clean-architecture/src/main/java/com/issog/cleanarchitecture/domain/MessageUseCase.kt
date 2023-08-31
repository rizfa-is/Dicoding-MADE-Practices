package com.issog.cleanarchitecture.domain

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}