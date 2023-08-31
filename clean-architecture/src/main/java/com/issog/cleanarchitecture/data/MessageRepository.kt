package com.issog.cleanarchitecture.data

import com.issog.cleanarchitecture.domain.IMessageRepository
import com.issog.cleanarchitecture.domain.MessageEntity

class MessageRepository(
    private val messageDataSource: MessageDataSource
): IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity {
        return messageDataSource.getMessageFromSource(name)
    }
}