package com.nmb.material3expressive

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.VectorConverter
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ContainedLoadingIndicator
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.LoadingIndicator
import androidx.compose.material3.LoadingIndicatorDefaults
import androidx.compose.material3.MaterialShapes
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nmb.material3expressive.ui.theme.Material3ExpressiveTheme
import com.nmb.material3expressive.ui.theme.onPrimaryContainerLight
import com.nmb.material3expressive.ui.theme.primaryContainerLight
import com.nmb.material3expressive.ui.theme.primaryLight

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Material3ExpressiveTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Surface(
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        Material3ExpressiveApp()
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun Material3ExpressiveApp() {
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
           "Material3 Expressive",
            style = TextStyle(
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
        )

        LoadingIndicator(
            modifier = Modifier.size(120.dp),
            color = Color.Cyan,
            polygons = LoadingIndicatorDefaults.IndeterminateIndicatorPolygons
        )

        LoadingIndicator(
            modifier = Modifier.size(120.dp),
            color = primaryLight,
            polygons = LoadingIndicatorDefaults.DeterminateIndicatorPolygons
        )

        LoadingIndicator(
            modifier = Modifier.size(120.dp),
            color = Color.Black,
            polygons = listOf(
                MaterialShapes.Flower,
                MaterialShapes.Square,
                MaterialShapes.Diamond
            )
        )

        LoadingIndicator(
            modifier = Modifier.size(120.dp),
            color = Color.Black,
            polygons = listOf(
                MaterialShapes.Ghostish,
                MaterialShapes.Diamond
            )
        )

        ContainedLoadingIndicator(
            modifier = Modifier.size(120.dp),
            containerColor = Color.LightGray,
            indicatorColor = Color.Red,
            polygons = listOf(
                MaterialShapes.Ghostish,
                MaterialShapes.Diamond
            )
        )

        Spacer(modifier = Modifier.size(14.dp))

        ContainedLoadingIndicator(
            modifier = Modifier.size(120.dp),
            polygons = LoadingIndicatorDefaults.IndeterminateIndicatorPolygons
        )


    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Material3ExpressiveAppPreview() {
    Material3ExpressiveTheme {
        Material3ExpressiveApp()
    }
}