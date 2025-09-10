package com.example.my_shoping_listday_7

import android.R
import com.google.android.gms.common.api.HasApiKey
import com.google.android.gms.maps.model.LatLng
import retrofit2.http.GET
import retrofit2.http.Query

interface GeoCodingApiService {

    @GET("maps/api/geocode/json")
    suspend fun getAddressFromcCoordinates(
            @Query("latlng") latLng: String,
            @Query("key") apiKey: String
    ): GeocodeingRespond

}