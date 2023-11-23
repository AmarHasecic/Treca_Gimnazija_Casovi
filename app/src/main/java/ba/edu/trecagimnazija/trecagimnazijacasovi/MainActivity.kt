package ba.edu.trecagimnazija.trecagimnazijacasovi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ba.edu.trecagimnazija.trecagimnazijacasovi.ui.theme.TrecaGimnazijaCasoviTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TrecaGimnazijaCasoviTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BrojacScreen()
                }
            }
        }
    }
}


@Composable
fun BrojacScreen(){

    var brojac: Int by remember { mutableStateOf(0) }
    //var brojac by remember { mutableStateOf(0) }


    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Center
    ) {
    Column(
        horizontalAlignment = CenterHorizontally
    ) {
        Text(
            text = brojac.toString(),
            fontWeight = FontWeight.Bold,
            fontSize = 50.sp
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = { brojac++ }) {
            Text(text = "Povecaj broj za 1")
        }
        Button(onClick = { brojac-- }) {
            Text(text = "Smanji broj za 1")
        }
        Button(onClick = { brojac = 0 }) {
            Text(text = "Vrati broj na 0")
        }
    }
 }

}

