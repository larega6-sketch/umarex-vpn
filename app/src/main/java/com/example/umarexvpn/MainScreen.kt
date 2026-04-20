@Composable
fun MainScreen() {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "UMAREX VPN", fontSize = 24.sp) 
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { /* TODO: Add connection logic */ }) {
            Text(text = "Connect")
        }
        Spacer(modifier = Modifier.height(32.dp))
        Text(text = "Available Servers:", fontSize = 18.sp)
        // Placeholder for server list navigation - this can be implemented based on actual data
        LazyColumn {
            items(listOf("Server 1", "Server 2", "Server 3")) { server ->
                Text(text = server, modifier = Modifier.padding(8.dp))
            }
        }
    }
}