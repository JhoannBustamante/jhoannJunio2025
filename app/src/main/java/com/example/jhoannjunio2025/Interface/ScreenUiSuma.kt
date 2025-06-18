package com.example.jhoannjunio2025.Interface

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jhoannjunio2025.superfuncion.sumaSuperFun

@ExperimentalMaterial3Api
@Composable
fun ScaffoldScreensuma() {
    val n1 = 5
    val n2 = 3
    val res = sumaSuperFun(n1, n2) { n1, n2 -> n1 + n2 }

    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Blue
                ),
                title = {
                    Text(text = "Práctica Suma de dos numeros",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                })
        },
        floatingActionButton = {
            FloatingActionButton(
                containerColor = Color.Cyan,
                shape = CircleShape,
                onClick = {}
            ) {
                Text(
                    text = "+",
                    fontSize = 48.sp,
                )
            }
        }
    ) { paddingValues ->
        Box (
            contentAlignment = Alignment.BottomEnd,
            modifier = Modifier.padding(paddingValues)
                .fillMaxSize()
        ){
            Column {
                Row (
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxSize().padding(16.dp)
                ) {
                    Text (
                        text = "$n1 + $n2 = $res",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                    )
                }
            }
        }
    }
}