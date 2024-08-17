package com.example.fitnesshealthmonitoringapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Alignment


@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        LazyRow(modifier = Modifier.padding(bottom = 16.dp)) {
            item {
                Button(onClick = { navController.navigate("dashboard") }) {
                    Text("Dashboard")
                }
                Spacer(modifier = Modifier.width(8.dp))
                Button(onClick = { navController.navigate("activity_tracking") }) {
                    Text("Activity Tracking")
                }
                Spacer(modifier = Modifier.width(8.dp))
                Button(onClick = { navController.navigate("nutrition_tracking") }) {
                    Text("Nutrition Tracking")
                }
                Spacer(modifier = Modifier.width(8.dp))
                Button(onClick = { navController.navigate("profile") }) {
                    Text("Profile")
                }
            }
        }

        // Additional content for the home screen can go here
        Text(text = "Welcome to the Fitness Health Monitoring  App!",

            color = Color.Green,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth().wrapContentSize(Alignment.Center).background(Color.DarkGray, shape = RoundedCornerShape(8.dp))
                .padding(16.dp)
        )
        Column(modifier = Modifier.fillMaxSize()) {
            Text(
                text = "ASSIGNMENT",
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                modifier =Modifier
                    .fillMaxWidth()
                    .wrapContentSize(Alignment.Center)
                    .background(Color.LightGray, shape = RoundedCornerShape(8.dp))
                    .padding(16.dp)
            )

            Spacer(modifier = Modifier.height(16.dp)) // Add some space between text and boxes

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly // Distribute boxes evenly
            ) {
                Box(
                    modifier = Modifier.width(300.dp)
                        .height(180.dp)
                        .background(Color.Blue)
                )
                Box(
                    modifier = Modifier
                        .width(300.dp)
                        .height(180.dp)
                        .background(Color.Green)
                )
            }
                Spacer(modifier = Modifier.height(33.dp))

            Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly // Distribute boxes evenly
                ) {

                    Box(modifier = Modifier
                        .width(300.dp)
                        .height(180.dp)
                        .background(Color.Yellow))

                    Box(modifier = Modifier
                        .width(300.dp)
                        .height(180.dp)
                        .background(Color.Cyan)){Text("Hello, Box!")}

                }
            }
        }
}
