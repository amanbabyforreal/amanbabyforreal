package com.example.fitnesshealthmonitoringapp.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.fitnesshealthmonitoringapp.model.sampleActivities
import com.example.fitnesshealthmonitoringapp.ui.components.ActivityListItem

@Composable
fun ActivityFeedScreen(navController: NavController) {
    LazyColumn {
        items(sampleActivities) { activity ->
            ActivityListItem(
                activity = activity,
                onClick = {
                    navController.navigate("activity_details/${activity.id}")
                }
            )
        }
    }
}

