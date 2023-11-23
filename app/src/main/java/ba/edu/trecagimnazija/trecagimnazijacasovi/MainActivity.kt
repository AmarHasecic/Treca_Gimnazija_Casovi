package ba.edu.trecagimnazija.trecagimnazijacasovi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
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
                    IzrekeEkran()
                }
            }
        }
    }
}

@Composable
fun IzrekeEkran() {

    val screenWidthInDp = with(LocalDensity.current) {
        LocalContext.current.resources.displayMetrics.widthPixels.toDp()
    }

    val izreke = listOf(
        "Toliko je bilo u životu stvari kojih smo se bojali. A nije trebalo. Trebalo je živjeti.",
        "Boj se ovna, boj se govna, a kad ću živjeti?",
        "Ispričaću priču vama, o bosanskim planinama, o Krajini, gnijezdu buna, kud protiče brza Una."
    )

    val pisci = listOf(
        "Ivo Andrić",
        "Meša Selimović",
        "Branko Ćopić"
    )


    Box(
        modifier = Modifier.background(Color(0xFFA3C280)),

    ) {

        Text(
            text = "Citati",
            fontSize = 30.sp,
            color = Color.DarkGray,
            modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 240.dp)
                .align(Alignment.TopStart)
        )

            LazyRow(
                modifier = Modifier.align(Alignment.Center)
            ) {

                for (i in 0 until izreke.size) {
                    item {
                        Box(
                            modifier = Modifier
                                .width(screenWidthInDp)
                                .height(150.dp)
                                .padding(horizontal = 25.dp)
                                .background(color = Color(0x17000000))
                        ) {
                            Text(
                                text = izreke[i],
                                color = Color.DarkGray,
                                modifier = Modifier.padding(20.dp)
                            )

                            Text(
                                text = "- " + pisci[i],
                                color = Color.DarkGray,
                                modifier = Modifier.align(Alignment.BottomEnd)
                                    .padding(20.dp)

                            )
                        }
                    }
                }

            }


    }
}
