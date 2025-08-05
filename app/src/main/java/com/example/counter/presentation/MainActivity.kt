/* While this template provides a good starting point for using Wear Compose, you can always
 * take a look at https://github.com/android/wear-os-samples/tree/main/ComposeStarter to find the
 * most up to date changes to the libraries and their usages.
 */

package com.example.counter.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()

        super.onCreate(savedInstanceState)

        setTheme(android.R.style.Theme_DeviceDefault)

        setContent {
            Counter()
//            WearApp("Android")
        }
    }
}

@Composable
fun Counter(){
    var x by remember {
        mutableStateOf(0)
    }
    Box(
        contentAlignment = Alignment.Center,

        modifier = Modifier
            .fillMaxSize()
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
            ,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                shape = RectangleShape,
                modifier = Modifier
                    .height(20.dp)
                    .width(20.dp),

                onClick = {
                x -= 1
                }
            ) { Text(text = "-") }

            Text(
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Black,
                text = x.toString(),

            )

            Button(
                shape = RectangleShape,
                modifier = Modifier
                    .height(20.dp)
                    .width(20.dp),
                onClick = {
                x += 1
            }) { Text(text = "+") }
        }
    }
}
