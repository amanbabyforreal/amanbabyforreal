package com.example.fitnesshealthmonitoringapp.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fitnesshealthmonitoringapp.model.ActivityModels

@Composable
fun ActivityListItem(
    activity: ActivityModels,
    onClick: (ActivityModels) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onClick(activity) }
    ) {
        Text(text = "${activity.type} - ${activity.duration}", style = MaterialTheme.typography.titleMedium)
        Text(text = "Calories Burned: ${activity.caloriesBurned}", style = MaterialTheme.typography.bodyMedium)
        Text(text = "${activity.time}, ${activity.date}", style = MaterialTheme.typography.bodySmall)
    }
}
@Preview(showBackground = true)
@Composable
fun ActivityListItem(){
}