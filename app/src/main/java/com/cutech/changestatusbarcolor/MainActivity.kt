package com.cutech.changestatusbarcolor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cutech.changestatusbarcolor.ui.theme.ChangeStatusbarColorTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.dark(
                scrim = Color.Red.toArgb()
            )
        )
        setContent {
            // Need to update here
            ChangeStatusbarColorTheme {
                Scaffold(modifier = Modifier.fillMaxSize(), topBar = {
                    CenterAlignedTopAppBar(
                        title = { Text(text = "Toolbar", color = Color.White) },
                        colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.DarkGray)
                    )
                }) { innerPadding ->
                    PrepareScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun PrepareScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.LightGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Change status bar color",
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.W600,
            fontFamily = FontFamily.Serif
        )

        Spacer(modifier = Modifier.padding(vertical = 5.dp))

        Text(
            text = "& icons color",
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.W600,
            fontFamily = FontFamily.Serif
        )
    }
}
