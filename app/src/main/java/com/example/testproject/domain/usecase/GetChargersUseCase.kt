package com.example.testproject.domain.usecase

import com.example.testproject.data.model.ChargerData
import com.example.testproject.data.repository.ChargerRepository
import javax.inject.Inject

class GetChargersUseCase @Inject constructor(private val repository: ChargerRepository) {
    suspend operator fun invoke(): List<ChargerData> = repository.getChargers()
}