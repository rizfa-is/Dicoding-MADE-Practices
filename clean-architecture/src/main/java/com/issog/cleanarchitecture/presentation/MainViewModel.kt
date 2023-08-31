package com.issog.cleanarchitecture.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.issog.cleanarchitecture.domain.MessageEntity
import com.issog.cleanarchitecture.domain.MessageUseCase

class MainViewModel(
    private val messageUseCase: MessageUseCase
): ViewModel() {
    private val _message = MutableLiveData<MessageEntity>()
    val message: LiveData<MessageEntity>
        get() = _message

    fun setName(name: String) {
        _message.postValue(
            messageUseCase.getMessage(name)
        )
    }
}