package com.example.junitmockitodemo

import com.example.junitmockitodemo.data.UserRepository
import com.example.junitmockitodemo.model.User
import com.example.junitmockitodemo.uii.UserViewModel
import kotlinx.coroutines.MainCoroutineDispatcher
import org.junit.Assert.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.kotlin.verify
import org.mockito.kotlin.whenever

class MockitoTest {

    @Test
    fun testMockito()= runTest{

        val userRepository=mock<UserRepository>()

        val expectedUSer= User(1,"Nikhil","nikhil@gmail.com")

        whenever(userRepository.getUser()).thenReturn(expectedUSer)

        val result=userRepository.getUser()

        assertEquals(result, expectedUSer)


    }

    @get:Rule
    val mainDispatcherRule = MainDispatcherRule()

    @Test
    fun verfiy()=runTest{
        val userRepository = mock<UserRepository>()
        val userViewModel = UserViewModel(userRepository)

        userViewModel.getUser()

        verify(userRepository).getUser()
    }
}