package com.example.fitnesshealthmonitoringapp.ui.navigation

import androidx.navigation.NavHostController

class Navigation(private val navController: NavHostController) {

    fun navigateToSignUp() {
        navController.navigate("sign_up")
    }

    fun navigateToSignIn() {
        navController.navigate("sign_in")
    }

    fun navigateToDashboard() {
        navController.navigate("dashboard")
    }

    fun navigateToActivityTracking() {
        navController.navigate("activity_tracking")
    }

    fun navigateToNutritionTracking() {
        navController.navigate("nutrition_tracking")
    }

    fun navigateToProfile() {
        navController.navigate("profile")
    }
    fun navigateToProfileActivityFeed(){
        navController.navigate("ActivityFeedScreen")
    }
}
