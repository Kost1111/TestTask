package com.example.testproject.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.testproject.presentation.screen.ChargerListScreen
import com.example.testproject.presentation.screen.CitySelectionScreen
import com.example.testproject.presentation.viewModel.ChargerViewModel

@Composable
fun AppContent(viewModel: ChargerViewModel) {
    var selectedCity by remember { mutableStateOf<String?>(null) }
    val chargers by viewModel.chargers.collectAsState()

    if (selectedCity == null) {
        CitySelectionScreen(
            cities = chargers.map { it.city }.distinct(),
            onCitySelected = { city ->
                selectedCity = city
            }
        )
    } else {
        ChargerListScreen(
            chargers = chargers.filter { it.city == selectedCity }.sortedBy { it.charger.name },
            onBack = { selectedCity = null }
        )
    }
}