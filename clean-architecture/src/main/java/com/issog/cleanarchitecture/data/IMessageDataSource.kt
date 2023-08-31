package com.issog.cleanarchitecture.data

import com.issog.cleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}