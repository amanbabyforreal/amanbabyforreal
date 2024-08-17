package com.example.fitnesshealthmonitoringapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.fitnesshealthmonitoringapp.model.ActivityModels
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun ActivityDetailsScreen(
    activity: ActivityModels,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "${activity.type} Details", style = MaterialTheme.typography.headlineMedium)

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Duration: ${activity.duration}", style = MaterialTheme.typography.bodyLarge)
        Text(text = "Calories Burned: ${activity.caloriesBurned}", style = MaterialTheme.typography.bodyLarge)
        Text(text = "Distance: ${activity.details.distance} km", style = MaterialTheme.typography.bodyLarge)
        Text(text = "Average Speed: ${activity.details.avgSpeed} km/h", style = MaterialTheme.typography.bodyLarge)

        Spacer(modifier = Modifier.height(16.dp))

        activity.details.routeMapUrl?.let { url ->
            // If you have a way to display a map, include it here.
            Text(text = "Route Map: $url", style = MaterialTheme.typography.bodyLarge)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewActivityDetailsScreen() {
}