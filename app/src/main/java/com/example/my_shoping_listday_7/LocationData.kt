package com.example.my_shoping_listday_7

data class LocationData(
    val latitude: Double,
    val longitude: Double
)

data class GeocodeingRespond(
    val results: List<GeocodeingResult>,
    val status: String
)

data class GeocodeingResult(
    val formatted_address: String
)
