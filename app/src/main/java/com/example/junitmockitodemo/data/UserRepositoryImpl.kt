package com.example.junitmockitodemo.data

import com.example.junitmockitodemo.model.User

class UserRepositoryImpl : UserRepository{
    override suspend fun getUser(): User {
        return User(
            id = 1,
            name = "Nikhil",
            email = "nikhil@gmail.com"
        )
    }
}