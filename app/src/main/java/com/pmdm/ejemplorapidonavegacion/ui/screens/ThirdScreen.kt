package com.pmdm.ejemplorapidonavegacion.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThirdScreen(
    navigateToFirstScreen: () -> Unit,
    navigateBack: () -> Unit
) {
    Scaffold (
        topBar = {
            TopAppBar(
                title = { Text("Third Screen") },
                navigationIcon = {
                    Button(onClick = { navigateBack() }) {
                        Text("Back")
                    }
                }
            )
        }
    ) {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Third Screen")
            Button(
                onClick = { navigateToFirstScreen() },
                modifier = Modifier.padding(16.dp)
            ) {
                Text("Go to First Screen")
            }
        }
    }

}