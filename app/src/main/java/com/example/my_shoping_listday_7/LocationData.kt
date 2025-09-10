//package com.example.my_shoping_listday_7
//
//data class LocationData(
//    val latitude: Double,
//    val longitude: Double
//)
//
//data class GeocodeingRespond(
//    val results: List<GeocodeingResult>,
//    val status: String
//)
//
//data class GeocodeingResult(
//    val formatted_address: String
//)


package eu.tutorials.myshoppinglistapp

data class LocationData(
    val latitude: Double,
    val longitude: Double
)

data class GeocodingResponse(
    val results: List<GeocodingResult>,
    val status: String
)

data class GeocodingResult(
    val formatted_address: String
)