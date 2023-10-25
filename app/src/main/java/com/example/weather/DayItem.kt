package com.example.weather

data class DayItem(
    val city: String,
    val time: String,
    val condition: String,
    val imageUrl: String,
    val currentTemp: String,
    val MaxTemp: String,
    val MinTemp: String,
    val hours: String,
)
