package com.example.fitnesshealthmonitoringapp.model


val sampleActivities = listOf(
    ActivityModels(
        id = 1,
        type = "Running",
        duration = "30 min",
        caloriesBurned = 300,
        time = "6:00 AM",
        date = "2024-08-13",
        details = ActivityDetails(
            distance = 5.0,
            avgSpeed = 10.0,
            routeMapUrl = "https://example.com/map1.png"
        )
    ),
    ActivityModels(
        id = 2,
        type = "Cycling",
        duration = "45 min",
        caloriesBurned = 450,
        time = "7:30 AM",
        date = "2024-08-12",
        details = ActivityDetails(
            distance = 15.0,
            avgSpeed = 20.0,
            routeMapUrl = "https://example.com/map2.png"
        )
    )
)

