package com.example.superheroes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import com.example.superheroes.ui.theme.SuperHeroesTheme
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.superheroes.model.Heroe

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperHeroesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    heroesList(Datasource().listaHeroes())
                }
            }
        }
    }
}

@Composable
private fun heroesList(listaHeroes: List<Heroe>) {
    LazyColumn() {
        items(listaHeroes) { heroes ->
            heroesCard(heroes, modifier = Modifier)
        }
    }
}

@Composable
fun heroesCard(
    heroe: Heroe,
    modifier: Modifier
) {
    Card(modifier = Modifier.padding(8.dp), elevation = 4.dp)
    {
        Row(
            modifier = Modifier
                .padding(4.dp)
                .fillMaxWidth()
        )
        {
            Column(modifier = Modifier)
            {
                Text(
                    text = stringResource(heroe.nombre),
                    style = MaterialTheme.typography.h3
                )
                Image(
                    modifier = Modifier
                        .size(80.dp)
                        .align(alignment = Alignment.CenterHorizontally),
                    painter = painterResource(heroe.imagenId),
                    contentDescription = "Imagen del heroe",
                    contentScale = ContentScale.Crop,
                )

            }
            Column(modifier = Modifier.weight(1f)) {
                
            }
            Column(modifier = Modifier) {
                Text(
                    text = "Super poder",
                    style = MaterialTheme.typography.h5,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                Text(
                    text = stringResource(heroe.descripcion),
                    style = MaterialTheme.typography.body1,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )

            }

        }
    }
}

@Preview
@Composable

fun Preview() {
    SuperHeroesTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            heroesList(Datasource().listaHeroes())
        }
    }

}

