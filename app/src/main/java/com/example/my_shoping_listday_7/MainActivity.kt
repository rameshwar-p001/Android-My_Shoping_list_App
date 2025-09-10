package com.example.my_shoping_listday_7

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.dialog
import androidx.navigation.compose.rememberNavController
import com.example.my_shoping_listday_7.ui.theme.My_shoping_listday_7Theme
import kotlin.contracts.contract

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            My_shoping_listday_7Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Surface(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        color = MaterialTheme.colorScheme.background
                    ) {
//                        Navigation()
                    }
                }
            }
        }
    }
}

@Composable
fun Navigation(){
    val navController = rememberNavController()
    val viewModel : LocationViewModel = viewModel(  )
    val context = LocalContext.current
    val locationUtils = LocationUtils(context)

    NavHost(navController , startDestination = "shopinglistscreen "){
        composable("shopinglistscreen"){
            shopingListApp(
                locationUtils,
                viewModel,
                navController,
                context,
                viewModel.address.value.firstOrNull()?.formatted_address ?:"No Address"
            )
        }
        dialog("locationscreen"){
            backStackEntry -> viewModel .location.value?.let {
                  it1->  LocationSelectionScreen(it1,{locationData ->
                      viewModel.fetchAddress("${locationData.latitude} ,${locationData.longitude}")
            navController.popBackStack()
        })
        }
        }
    }
}
