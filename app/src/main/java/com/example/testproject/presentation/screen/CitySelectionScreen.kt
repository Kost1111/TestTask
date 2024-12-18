package com.example.testproject.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CitySelectionScreen(cities: List<String>, onCitySelected: (String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Выберите город", modifier = Modifier.padding(bottom = 16.dp))
        cities.forEach { city ->
            Button(
                onClick = { onCitySelected(city) },
                modifier = Modifier.padding(vertical = 8.dp)
            ) {
                Text(city)
            }
        }
    }
}