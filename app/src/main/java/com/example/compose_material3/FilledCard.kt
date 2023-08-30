package com.example.compose_material3

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun FilledcardExample() {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.tertiaryContainer
        ),
        modifier = Modifier
            .size(width = 250.dp, height = 200.dp)
            .padding(16.dp)
    ) {
        Text(
            text = "Filled card example and it is a simple one with no icons and buttons, thanks!",
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Center
            )
        Icon(imageVector = Icons.Default.Face, contentDescription = null)
    }
}