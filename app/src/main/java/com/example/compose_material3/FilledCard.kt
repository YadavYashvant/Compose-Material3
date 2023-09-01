package com.example.compose_material3

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun FilledcardExample() {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.tertiaryContainer
        ),
        modifier = Modifier
            .size(width = 420.dp, height = 250.dp)
            .padding(vertical = 15.dp, horizontal = 20.dp)
            .absolutePadding(left = 15.dp)
    ) {
        Column(
            modifier = Modifier
        ) {
        Text(
            text = "Filled card example and it is a simple one with no buttons, its container color is set to tertiaryContainer from colorSchemes provided by material, this is done to ensure that, app looks better even during dark mode.Thanks!",
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
            )
            Box(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            ){
                Icon(imageVector = Icons.Default.Face, contentDescription = null)
                Icon(imageVector = Icons.Default.CheckCircle, contentDescription = null, modifier = Modifier.absolutePadding(left = 30.dp))
            }
            Text(text = "Above Icons are just for test purposes, nothing intentional",
                modifier = Modifier
                    .padding(16.dp),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
                )
    }}
}