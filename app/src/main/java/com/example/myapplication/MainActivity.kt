package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme // Or MaterialTheme from androidx.compose.material
import androidx.compose.material3.Surface   // Or Surface from androidx.compose.material
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.myapplication.ui.theme.EmojiFlipCardTheme // Assuming your theme is here
import com.example.myapplication.views.MemoryGameScreen // Assuming your screen is here

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Apply your custom theme to the content
            EmojiFlipCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background // Or MaterialTheme.colors.background for older Material
                ) {
                    MemoryGameScreen() // Your main game screen composable
                }
            }
        }
    }
}