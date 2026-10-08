package com.example.junitmockitodemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.junitmockitodemo.data.UserRepositoryImpl
import com.example.junitmockitodemo.ui.theme.JUnitMockitoDemoTheme
import com.example.junitmockitodemo.uii.UserScreen
import com.example.junitmockitodemo.uii.UserViewModel
import com.example.junitmockitodemo.uii.UserViewModelFactory

class MainActivity : ComponentActivity() {
    private val userViewModel: UserViewModel by viewModels {
        UserViewModelFactory(
            UserRepositoryImpl()
        )
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val repository = UserRepositoryImpl()

        enableEdgeToEdge()
        setContent {
            JUnitMockitoDemoTheme {
                UserScreen(userViewModel)
            }
        }
    }
}
