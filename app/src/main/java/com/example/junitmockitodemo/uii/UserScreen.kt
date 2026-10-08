package com.example.junitmockitodemo.uii

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun UserScreen(viewModel: UserViewModel){
    val user by viewModel.user.collectAsState()

    Column(
        modifier = Modifier.padding(16.dp)
    ) {

        Text(
            text = user?.name ?: "No user"
        )

        Text(
            text = user?.email ?: ""
        )

        Button(
            onClick = {
                viewModel.getUser()
            }
        ) {
            Text("Load User")
        }
    }
}