package ba.edu.trecagimnazija.trecagimnazijacasovi.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import ba.edu.trecagimnazija.trecagimnazijacasovi.R

@Composable
fun MainScreen(){

    val screenWidthInDp = with(LocalDensity.current) {
        LocalContext.current.resources.displayMetrics.widthPixels.toDp()
    }

    val screenHeightInDp = with(LocalDensity.current) {
        LocalContext.current.resources.displayMetrics.heightPixels.toDp()
    }

    var broj by remember { mutableStateOf(0) }

    Column {

        //Opis kuće
        Box(
            modifier = Modifier.height(screenHeightInDp / 2)
                .width(screenWidthInDp / 2)
        ) {

        }


        //Navigacijski dugmići
        Column {

            Row {

                Button(
                    onClick = { broj = 1 },
                    modifier = Modifier
                        .height(screenHeightInDp / 4)
                        .width(screenWidthInDp / 2),
                    shape = RoundedCornerShape(0)

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.hufflepuff),
                        contentDescription = "Hufflepuff",
                        modifier = Modifier.fillMaxSize()
                    )
                }


                Button(
                    onClick = { broj = 2 },
                    modifier = Modifier
                        .height(screenHeightInDp / 4)
                        .width(screenWidthInDp / 2),
                    shape = RoundedCornerShape(0)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.slytherin),
                        contentDescription = "Slytherin",
                    )
                }
            }

            Row {

                Button(
                    onClick = { broj = 3 },
                    modifier = Modifier
                        .height(screenHeightInDp / 4)
                        .width(screenWidthInDp / 2),
                    shape = RoundedCornerShape(0)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.gryffindor),
                        contentDescription = "Gryffindor",
                        modifier = Modifier.fillMaxSize()
                    )
                }

                Button(
                    onClick = { broj = 4 },
                    modifier = Modifier
                        .height(screenHeightInDp / 4)
                        .width(screenWidthInDp / 2),
                    shape = RoundedCornerShape(0)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ravenclaw),
                        contentDescription = "Ravenclaw",
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }


        }
    }
}