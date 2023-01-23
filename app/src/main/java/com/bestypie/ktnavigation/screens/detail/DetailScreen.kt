package com.bestypie.ktnavigation.screens.detail

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DetailScreen(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar(modifier = Modifier, backgroundColor = Color.Magenta) {
            Row(modifier = Modifier.clickable {
                navController.popBackStack();
            }, horizontalArrangement = Arrangement.Start) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Arrow Back")
                Spacer(modifier = Modifier.width(20.dp))
                Text(text = "Back", style = MaterialTheme.typography.h5)
            }
        }
    }, floatingActionButton = {
        FloatingActionButton(onClick = {}) {
            Icon(imageVector = Icons.Default.Phone, contentDescription = "Phone Call", modifier = Modifier, tint = Color.White)
        }
    }) {
    // Add Scaffold Content Here


    }
}