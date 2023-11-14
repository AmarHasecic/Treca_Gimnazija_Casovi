package ba.edu.trecagimnazija.trecagimnazijacasovi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
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
                    Pozdrav(tekstPozdrava = "Hello Android")
                }
            }
        }
    }
}

@Composable
fun Pozdrav(tekstPozdrava: String){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        LazyColumn() {
            item {
                Text(
                    text = tekstPozdrava,
                    fontSize = 50.sp,
                    color = Color.Cyan
                )
            }

            // Možemo dodati koliko god želimo itema u kolonu

        }
    }
}


