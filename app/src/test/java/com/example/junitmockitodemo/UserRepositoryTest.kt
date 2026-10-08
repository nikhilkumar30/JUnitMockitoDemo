package com.example.junitmockitodemo

import com.example.junitmockitodemo.data.UserRepositoryImpl
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.Test

class UserRepositoryTest {

    @Test
    fun getUser_returnsCorrectUser(): Unit = runTest {

        @Before
        fun setup(){
            println("Setting up the test environment")
        }

        // Arrange
        val repository = UserRepositoryImpl()

        // Act
        val user = repository.getUser()

        // Assert
        assertEquals(1, user.id)
        assertEquals("Nikhil", user.name)
        assertEquals("nikhil@gmail.com", user.email)
    }
    @Test
    fun getUser_returnsWrongUser(): Unit = runTest {

        // Arrange
        val repository = UserRepositoryImpl()

        // Act
        val user = repository.getUser()

        // Assert
        assertNotEquals(1*2, user.id)
        assertNotEquals("Nikhil".length+1, user.name.length)
        assertNotEquals("nikhil@gmail.coms", user.email)
    }
}