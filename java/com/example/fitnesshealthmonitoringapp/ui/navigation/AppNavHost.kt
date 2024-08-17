package com.example.fitnesshealthmonitoringapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.fitnesshealthmonitoringapp.model.sampleActivities
import com.example.fitnesshealthmonitoringapp.ui.screens.*

@Composable
fun AppNavHost(
    navController: NavHostController,
    navigation: Navigation
) {
    NavHost(navController = navController, startDestination = "sign_in") {
        composable("sign_in") {
            SignInScreen(
                onSignUpClick = { navigation.navigateToSignUp() },
                onLoginSuccess = { navController.navigate("home") } // Navigate to home on login success
            )
        }
        composable("sign_up") {
            SignUpScreen(onSignInClick = { navigation.navigateToSignIn() })
        }
        composable("home") {
            HomeScreen(navController = navController)
        }
        composable("dashboard") {
            DashboardScreen()
        }
        composable("activity_tracking") {
            ActivityTrackingScreen()
        }
        composable("nutrition_tracking") {
            NutritionTrackingScreen()
        }
        composable("profile") {
            ProfileScreen(
                username = "", // Pass the actual username here
                onLogoutClick = { navigation.navigateToSignIn() },
                navController = navController // Pass the NavController to ProfileScreen
            )
        }
        // Add the Activity Feed and Activity Details routes
        composable("activity_feed") {
            ActivityFeedScreen(navController = navController)
        }
        composable("activity_details/{activityId}") { backStackEntry ->
            val activityId = backStackEntry.arguments?.getString("activityId")?.toIntOrNull()
            activityId?.let { id ->
                val activity = sampleActivities.firstOrNull { it.id == id }
                activity?.let {
                    ActivityDetailsScreen(activity = it)
                }
            }
        }
    }
}
