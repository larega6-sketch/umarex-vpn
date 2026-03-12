package com.umarex.vpn.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {
    // Main VPN Control UI
    Scaffold(
        topBar = { 
            TopAppBar(
                title = { Text("VPN Control") }
            ) 
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
            ,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(onClick = { /* TODO: Handle connection */ }) {
                Text("Connect VPN")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { /* TODO: Handle disconnection */ }) {
                Text("Disconnect VPN")
            }
        }
    }
}