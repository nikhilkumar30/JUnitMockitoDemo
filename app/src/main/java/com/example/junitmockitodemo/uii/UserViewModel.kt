package com.example.junitmockitodemo.uii

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.junitmockitodemo.data.UserRepository
import com.example.junitmockitodemo.model.User
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class UserViewModel(val userRepository: UserRepository) : ViewModel() {

    private val _user= MutableStateFlow<User?>(null)

    val user: StateFlow<User?> = _user.asStateFlow()

    fun getUser(){
        viewModelScope.launch {

            val result= userRepository.getUser()
            _user.value= result
        }
    }

}