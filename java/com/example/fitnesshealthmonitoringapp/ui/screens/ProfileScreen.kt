package com.example.fitnesshealthmonitoringapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun ProfileScreen(
    username: String,
    onLogoutClick: () -> Unit,
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    var gender by remember { mutableStateOf("Select Gender") }
    var dateOfBirth by remember { mutableStateOf("") }
    var height by remember { mutableStateOf("") }
    var weight by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Profile",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom= 16.dp)
        )

        // Basic Information
        Text(text = "Basic Information", style = MaterialTheme.typography.headlineSmall)

        TextField(
            value = username,
            onValueChange = {},
            label = { Text("Username") },
            enabled = false,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )

        DropdownMenuSample(
            label = "Gender",
            selectedOption = gender,
            onOptionSelected = { gender = it }
        )

        TextField(
            value = dateOfBirth,
            onValueChange = { dateOfBirth = it },
            label = { Text("Date of Birth") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )

        TextField(
            value = height,
            onValueChange = { height = it },
            label = { Text("Height (cm)") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )

        TextField(
            value = weight,
            onValueChange = { weight = it },
            label = { Text("Weight (kg)") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Activity Summary
        Text(text = "Activity Summary", style = MaterialTheme.typography.headlineSmall)
        // Add your activity summary here...

        Spacer(modifier = Modifier.height(16.dp))

        // Preferences
        Text(text = "Preferences", style = MaterialTheme.typography.headlineSmall)
        // Add your preferences section here...

        Spacer(modifier = Modifier.height(16.dp))

        // Start Button
        Button(
            onClick = {
                // Navigate to Dashboard screen
                navController.navigate("dashboard")
            },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(text = "Start")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Logout Button
        Button(
            onClick = onLogoutClick,
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
        ) {
            Text(text = "Logout")
        }
    }
}

@Composable
fun DropdownMenuSample(
    label: String,
    selectedOption: String,
    onOptionSelected: (String) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }

    Box {
        OutlinedTextField(
            value = selectedOption,
            onValueChange = {},
            label = { Text(label) },
            readOnly = true,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { expanded = true }
        )
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            DropdownMenuItem(onClick = {
                onOptionSelected("Boy")
                expanded = false
            }) {
                Text("Boy")
            }
            DropdownMenuItem(onClick = {
                onOptionSelected("Girl")
                expanded = false
            }) {
                Text("Girl")
            }
        }
    }
}

fun DropdownMenuItem(onClick: () -> Unit, interactionSource: @Composable () -> Unit) {

}
