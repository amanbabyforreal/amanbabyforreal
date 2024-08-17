package com.example.fitnesshealthmonitoringapp.model

data class ActivityModels(
    val id: Int,
    val type: String, // e.g., Running, Cycling, Walking
    val duration: String, // e.g., "45 min"
    val caloriesBurned: Int,
    val time: String, // e.g., "7:30 AM"
    val date: String, // e.g., "2024-08-13"
    val details: ActivityDetails
)

data class ActivityDetails(
    val distance: Double, // e.g., 5.4 km
    val avgSpeed: Double, // e.g., 10.5 km/h
    val routeMapUrl: String? // URL to a map image or map data (optional)
)
