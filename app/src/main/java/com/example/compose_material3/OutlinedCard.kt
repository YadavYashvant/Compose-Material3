package com.example.compose_material3

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun OutlinedCardExample() {
    OutlinedCard(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface,
        ),
        border = BorderStroke(1.dp, Color.Black),
        modifier = Modifier
            .size(width = 420.dp, height = 250.dp)
            .padding(vertical = 15.dp, horizontal =20.dp)
            .absolutePadding(left = 15.dp)
    ) {
        Text(
            text = "This is an example of outlined card, this looks sick, I might use it in one of my future projects.",
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )
    }
}