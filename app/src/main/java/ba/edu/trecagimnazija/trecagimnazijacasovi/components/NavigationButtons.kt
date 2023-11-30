package ba.edu.trecagimnazija.trecagimnazijacasovi.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import ba.edu.trecagimnazija.trecagimnazijacasovi.R

@Composable
fun NavigationButtons(){

    val screenWidthInDp = with(LocalDensity.current) {
        LocalContext.current.resources.displayMetrics.widthPixels.toDp()
    }

    val screenHeightInDp = with(LocalDensity.current) {
        LocalContext.current.resources.displayMetrics.heightPixels.toDp()
    }


        Column{

            Row{
                Box(
                    modifier = Modifier
                        .height(screenHeightInDp / 4)
                        .width(screenWidthInDp / 2)
                        .background(color = Color.Red)
                ){
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.fillMaxSize(),
                        shape = RoundedCornerShape(0)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.hufflepuff),
                            contentDescription = "Hufflepuff",
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                }

                Box(
                    modifier = Modifier
                        .height(screenHeightInDp / 4)
                        .width(screenWidthInDp / 2)
                        .background(color = Color.Blue)
                ){
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.fillMaxSize(),
                        shape = RoundedCornerShape(0)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.slytherin),
                            contentDescription = "Slytherin",
                        )
                    }
                }

            }

            Row{
                Box(
                    modifier = Modifier
                        .height(screenHeightInDp / 4)
                        .width(screenWidthInDp / 2)
                        .background(color = Color.Green)
                ){
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.fillMaxSize(),
                        shape = RoundedCornerShape(0)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.gryffindor),
                            contentDescription = "Gryffindor",
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                }

                Box(
                    modifier = Modifier
                        .height(screenHeightInDp / 4)
                        .width(screenWidthInDp / 2)
                        .background(color = Color.Yellow)
                ){
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.fillMaxSize(),
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
