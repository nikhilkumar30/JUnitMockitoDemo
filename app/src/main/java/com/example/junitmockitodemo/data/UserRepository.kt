package com.example.junitmockitodemo.data

import com.example.junitmockitodemo.model.User

interface UserRepository {

    suspend fun getUser(): User
}