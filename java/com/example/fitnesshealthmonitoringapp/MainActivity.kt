package com.example.fitnesshealthmonitoringapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.fitnesshealthmonitoringapp.ui.navigation.AppNavHost
import com.example.fitnesshealthmonitoringapp.ui.navigation.Navigation
import com.example.fitnesshealthmonitoringapp.ui.theme.FitnessHealthMonitoringAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitnessHealthMonitoringAppTheme {
                val navController = rememberNavController()
                val navigation = Navigation(navController)

                // Pass navigation instance to AppNavHost or any other component needing it
                AppNavHost(navController = navController, navigation = navigation)
            }
        }
    }
}
