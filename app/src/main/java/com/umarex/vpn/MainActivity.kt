package com.umarex.vpn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.umarex.vpn.ui.theme.YourThemeName

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YourThemeName { // apply Material Design 3 Theme
                Surface(color = MaterialTheme.colorScheme.background) {
                    Greeting("Hello, World!")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Welcome to the VPN app, \$name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    YourThemeName { // apply Material Design 3 Theme
        Greeting("Android")
    }
}