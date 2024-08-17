package com.example.fitnesshealthmonitoringapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun NutritionTrackingScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Nutrition Tracking", style = MaterialTheme.typography.headlineMedium)
        // Add your nutrition tracking UI components here
    }
}
