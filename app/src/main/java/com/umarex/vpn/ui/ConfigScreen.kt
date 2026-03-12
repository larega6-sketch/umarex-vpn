package com.umarex.vpn.ui

import androidx.compose.foundation.layout.*;
import androidx.compose.material.*;
import androidx.compose.runtime.*;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.dp;

@Composable
fun ConfigScreen() {
    var vlessConfig by remember { mutableStateOf("") }
    var vmessConfig by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Add Configurations") })
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("VLESS Configuration")
            OutlinedTextField(
                value = vlessConfig,
                onValueChange = { vlessConfig = it },
                label = { Text("VLESS Config") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text("VMess Configuration")
            OutlinedTextField(
                value = vmessConfig,
                onValueChange = { vmessConfig = it },
                label = { Text("VMess Config") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = { 
                // Handle Save 
            }) {
                Text("Save Configurations")
            }
        }
    }
}