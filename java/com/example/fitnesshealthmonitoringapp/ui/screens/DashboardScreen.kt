package com.example.fitnesshealthmonitoringapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color

@Composable
fun DashboardScreen() {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {

        // Daily Summary
        Box(
            modifier = Modifier
                .size(width = 200.dp, height = 150.dp) // Adjust size as needed
                .background(Color.LightGray,shape = RoundedCornerShape(8.dp))
                .padding(16.dp)
        ) {
            DailySummary(
                steps = 12345,
                calories = 678,
                distance = 5.4,
                activeMinutes = 90
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Progress Chart
        ProgressChart()

        Spacer(modifier = Modifier.height(16.dp))

        // Activity Log
        ActivityLog(
            activities= listOf(
                "Morning Run - 5 km",
                "Cycling - 15 km",
                "Yoga Session - 30 minutes"
            ))
    }
}

@Composable
fun DailySummary(steps: Int, calories: Int, distance: Double, activeMinutes: Int) {
    Column {
        Text(text = "Daily Summary", style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Steps: $steps", style = MaterialTheme.typography.bodyMedium)
        Text(text = "Calories: $calories", style = MaterialTheme.typography.bodyMedium)
        Text(text = "Distance: $distance km", style = MaterialTheme.typography.bodyMedium)
        Text(text = "Active Minutes: $activeMinutes", style = MaterialTheme.typography.bodyMedium)
    }
}

@Composable
fun ProgressChart() {
    // Placeholder for the LineChart implementation
    // You will need to create a custom composable or use a library to integrate MPAndroidChart with Compose
    // Currently, MPAndroidChart is not fully compatible with Compose out-of-the-box
    // Consider using alternative charting libraries or custom drawing
}

@Composable
fun ActivityLog(activities: List<String>) {
    Column {
        Text(text = "Activity Log", style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.height(8.dp))
        LazyColumn {
            items(activities.size) { index ->
                Text(
                    text = activities[index],
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(vertical = 4.dp)
                )

            }}}}

            @Preview(showBackground = true)
            @Composable
            fun PreviewDashboardScreen() {
            }
