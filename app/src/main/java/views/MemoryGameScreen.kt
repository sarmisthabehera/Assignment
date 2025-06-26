package com.example.myapplication.views

import android.app.Activity
import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

data class MemoryCard(
    val id: Int,
    val emoji: String,
    val isFaceUp: Boolean = false,
    val isMatched: Boolean = false
)

@SuppressLint("ContextCastToActivity", "UnusedBoxWithConstraintsScope")
@Composable
fun MemoryGameScreen() {
    val emojiList = listOf("🐶", "🐱", "🐹", "🦊", "🐻", "🐼", "🦄", "🐔", "🐧")
    val context = LocalContext.current as? Activity

    var cards by remember { mutableStateOf(listOf<MemoryCard>()) }
    var selectedIndices by remember { mutableStateOf(listOf<Int>()) }
    var score by remember { mutableStateOf(0) }
    var highScore by remember { mutableStateOf(0) }
    var timeLeft by remember { mutableStateOf(60) }
    var isRunning by remember { mutableStateOf(false) }
    var showDialog by remember { mutableStateOf(false) }
    var gameStarted by remember { mutableStateOf(false) }

    // Timer
    LaunchedEffect(isRunning) {
        if (isRunning) {
            while (timeLeft > 0) {
                delay(1000)
                timeLeft -= 1
            }
            isRunning = false
            cards = cards.map { it.copy(isFaceUp = false, isMatched = false) }
            if (score > highScore) highScore = score
            showDialog = true
        }
    }

    // Matching logic
    LaunchedEffect(selectedIndices) {
        if (selectedIndices.size == 2) {
            delay(600)
            val first = cards[selectedIndices[0]]
            val second = cards[selectedIndices[1]]
            cards = cards.map {
                when (it.id) {
                    first.id, second.id -> {
                        if (first.emoji == second.emoji && first.id != second.id) {
                            score += 1
                            it.copy(isMatched = true)
                        } else {
                            it.copy(isFaceUp = false)
                        }
                    }
                    else -> it
                }
            }
            selectedIndices = listOf()
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (gameStarted) {
            // Timer and score
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Time: ${timeLeft}s",
                    color = Color.White,
                    modifier = Modifier.padding(end = 8.dp)
                )
                LinearProgressIndicator(
                    progress = timeLeft / 60f,
                    modifier = Modifier
                        .weight(1f)
                        .height(10.dp)
                        .clip(RoundedCornerShape(4.dp)),
                    color = Color.Cyan,
                    trackColor = Color.DarkGray
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Card grid
            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.weight(1f)
            ) {
                items(cards.size) { index ->
                    MemoryCardView(
                        card = cards[index],
                        width = 100.dp,
                        height = 100.dp,
                        onClick = {
                            if (!cards[index].isFaceUp && !cards[index].isMatched && selectedIndices.size < 2) {
                                cards = cards.map {
                                    if (it.id == cards[index].id) it.copy(isFaceUp = true) else it
                                }
                                selectedIndices = selectedIndices + index
                            }
                        }
                    )
                }
            }
        }

        if (!gameStarted) {
            Button(
                onClick = {
                    cards = (emojiList + emojiList)
                        .shuffled()
                        .mapIndexed { index, emoji -> MemoryCard(index, emoji) }
                    score = 0
                    timeLeft = 60
                    isRunning = true
                    selectedIndices = listOf()
                    gameStarted = true
                    showDialog = false
                },
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth(0.7f)
                    .height(60.dp)
            ) {
                Text("🎮 Start Game", fontSize = 20.sp)
            }
        }
    }

    // Game Over Dialog
    if (showDialog) {
        AlertDialog(
            onDismissRequest = {},
            confirmButton = {
                TextButton(onClick = {
                    cards = (emojiList + emojiList)
                        .shuffled()
                        .mapIndexed { index, emoji -> MemoryCard(index, emoji) }
                    score = 0
                    timeLeft = 60
                    isRunning = true
                    selectedIndices = listOf()
                    showDialog = false
                }) {
                    Text("Play Again")
                }
            },
            dismissButton = {
                TextButton(onClick = { context?.finish() }) {
                    Text("Exit")
                }
            },
            title = { Text("⏰ Time's Up!", color = Color.White) },
            text = {
                Text(
                    "Your Score: $score\nHigh Score: $highScore",
                    color = Color.White
                )
            },
            containerColor = Color(0xFF2C2C2C)
        )
    }
}