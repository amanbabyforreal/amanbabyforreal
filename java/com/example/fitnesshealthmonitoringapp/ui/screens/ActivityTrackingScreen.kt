package com.example.fitnesshealthmonitoringapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
@Composable
fun ActivityTrackingScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // User Dashboard
        Text(text = "Daily Summary", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Steps: 10,000", style = MaterialTheme.typography.bodyMedium)
        Text(text = "Calories Burned: 500 kcal", style = MaterialTheme.typography.bodyMedium)
        Text(text = "Distance: 5 km", style = MaterialTheme.typography.bodyMedium)
        Text(text = "Active Minutes: 60 min", style = MaterialTheme.typography.bodyMedium)

        Spacer(modifier = Modifier.height(16.dp))

        // Progress Over Time
        Text(text = "Progress Over Time", style = MaterialTheme.typography.headlineSmall)
        // Graphs or charts can be added here

        Spacer(modifier = Modifier.height(16.dp))

        // Activity Log
        Text(text = "Activity Log", style = MaterialTheme.typography.headlineSmall)
        // List of past activities with edit and add options

        Spacer(modifier = Modifier.height(16.dp))

        // Real-time Tracking
        Text(text = "Real-time Tracking", style = MaterialTheme.typography.headlineSmall)
        // Live data display and GPS integration

        Spacer(modifier = Modifier.height(16.dp))

        // Integration with Wearables
        Text(text = "Integration with Wearables", style = MaterialTheme.typography.headlineSmall)
        // Sync with devices and real-time data syncing

        Spacer(modifier = Modifier.height(16.dp))

        // Health Metrics
        Text(text = "Health Metrics", style = MaterialTheme.typography.headlineSmall)
        // Heart rate monitoring, sleep tracking, and recovery insights
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewActivityTrackingScreen() {
    ActivityTrackingScreen()
}

