package com.example.my_shoping_listday_7

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.android.gms.maps.model.LatLng
import kotlinx.coroutines.launch

class LocationViewModel : ViewModel() {

    private val _location = mutableStateOf<LocationData?>(null)
    val location : State<LocationData?> = _location

    private val _address =mutableStateOf(listOf<GeocodeingResult>())
    val address : State<List<GeocodeingResult>> = _address
    fun updateLocation(newLocation : LocationData){
        _location.value=newLocation
    }

    fun fetchAddress(latLng: String){
        try {
            viewModelScope.launch {
                val result = RetrofitClient.create().getAddressFromcCoordinates(latLng,"AIzaSyDXvguGJlBUSGRPS6a_IFu1uvHvPsDjivY")

                _address.value=result.results

            }
        }catch(e: Exception) {
            Log.d("res1","${e.cause} ${e.message}")
        }
    }
}