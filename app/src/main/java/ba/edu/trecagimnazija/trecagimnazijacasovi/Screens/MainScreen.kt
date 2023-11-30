package ba.edu.trecagimnazija.trecagimnazijacasovi.Screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ba.edu.trecagimnazija.trecagimnazijacasovi.components.NavigationButtons

@Composable
fun MainScreen(){
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        NavigationButtons()
    }
}