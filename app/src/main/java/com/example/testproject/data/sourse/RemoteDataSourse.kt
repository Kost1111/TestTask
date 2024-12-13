package com.example.testproject.data.sourse

import com.example.testproject.data.model.Charger
import com.example.testproject.data.model.ChargerData

val fakeServerData = listOf(
    ChargerData("Moscow", Charger(true, "Энергия Москвы", "Измайловское ш., 4А")),
    ChargerData("Moscow", Charger(false, "Lipgart", "2-я Бауманская ул., 5, стр. 5")),
    ChargerData("Saint Petersburg", Charger(true, "Станция зарядки электромобилей", "Большой просп. Васильевского острова, 68")),
    ChargerData("Moscow", Charger(false, "Zevs", "Мясницкая ул., 13, стр. 10")),
    ChargerData("Saint Petersburg", Charger(false, "Punkt E", "Малая Монетная ул., 2Г"))
)