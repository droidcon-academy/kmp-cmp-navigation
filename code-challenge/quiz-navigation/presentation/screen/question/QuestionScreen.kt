package com.droidcon.demo.presentation.screen.question

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun QuestionScreen(onAnswerSelected: (Int) -> Unit) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("What is 2 + 2?")
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { onAnswerSelected(4) }) { Text("4") }
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { onAnswerSelected(4) }) { Text("5") }
        }
    }
}