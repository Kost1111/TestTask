package com.example.testproject.presentation.viewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testproject.data.model.ChargerData
import com.example.testproject.domain.usecase.GetChargersUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ChargerViewModel @Inject constructor(
    private val getChargersUseCase: GetChargersUseCase
) : ViewModel() {
    private val _chargers = MutableStateFlow<List<ChargerData>>(emptyList())
    val chargers: StateFlow<List<ChargerData>> get() = _chargers

    init {
        loadChargers()
    }

    private fun loadChargers() {
        viewModelScope.launch {
            _chargers.value = getChargersUseCase()
        }
    }
}