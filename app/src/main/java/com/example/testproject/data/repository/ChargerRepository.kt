package com.example.testproject.data.repository

import com.example.testproject.data.model.ChargerData

interface ChargerRepository {
    suspend fun getChargers(): List<ChargerData>
}