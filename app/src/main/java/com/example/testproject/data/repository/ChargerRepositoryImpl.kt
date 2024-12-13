package com.example.testproject.data.repository

import com.example.testproject.data.model.ChargerData
import com.example.testproject.data.sourse.fakeServerData
import kotlinx.coroutines.delay
import javax.inject.Inject

class ChargerRepositoryImpl @Inject constructor() : ChargerRepository {
    override suspend fun getChargers(): List<ChargerData> {
        delay(1000)
        return fakeServerData
    }
}