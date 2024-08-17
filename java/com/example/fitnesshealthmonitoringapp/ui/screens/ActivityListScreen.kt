package com.example.fitnesshealthmonitoringapp.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.fitnesshealthmonitoringapp.model.ActivityModels
import com.example.fitnesshealthmonitoringapp.ui.components.ActivityListItem

@Composable
fun ActivityListScreen(
    activities: List<ActivityModels>,
    onActivityClick: (ActivityModels) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        items(activities.size) { index ->
            ActivityListItem(activity = activities[index], onClick = onActivityClick)
        }
    }
}
