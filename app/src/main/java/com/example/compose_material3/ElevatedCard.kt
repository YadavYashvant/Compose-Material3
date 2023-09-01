package com.example.compose_material3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun ElevatedCard() {
    androidx.compose.material3.ElevatedCard(
        modifier = Modifier
            .size(width = 420.dp, height = 250.dp)
            .padding(vertical = 15.dp, horizontal = 20.dp)
            .absolutePadding(left = 15.dp)
    ) {
        Column {
            Text(text = "Filled card example and it is a simple one with no buttons, its container color is set to tertiaryContainer from colorSchemes provided by material, this is done to ensure that, app looks better even during dark mode.Thanks!",
                modifier = Modifier.padding(8.dp),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
                )
        }
    }
}