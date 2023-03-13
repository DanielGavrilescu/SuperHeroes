package com.example.superheroes

import com.example.superheroes.model.Heroe

class Datasource() {

    fun listaHeroes(): List<Heroe> {
        val heroes: List<Heroe> = listOf(
            Heroe(
                nombre = R.string.heroe_1,
                imagenId = R.drawable.antman,
                descripcion = R.string.descripcion_heroe_1
            ),
            Heroe(
                nombre = R.string.heroe_2,
                imagenId = R.drawable.spiderman,
                descripcion = R.string.descripcion_heroe_2
            ),
            Heroe(
                nombre = R.string.heroe_3,
                imagenId = R.drawable.batman,
                descripcion = R.string.descripcion_heroe_3
            ),
            Heroe(
                nombre = R.string.heroe_4,
                imagenId = R.drawable.dani_boy,
                descripcion = R.string.descripcion_heroe_4
            ),
            Heroe(
                nombre = R.string.heroe_5,
                imagenId = R.drawable.pantallazo_azul,
                descripcion = R.string.descripcion_heroe_5
            ),
            Heroe(
                nombre = R.string.heroe_6,
                imagenId = R.drawable.porrista,
                descripcion = R.string.descripcion_heroe_6
            ),
            Heroe(
                nombre = R.string.heroe_1,
                imagenId = R.drawable.antman,
                descripcion = R.string.descripcion_heroe_1
            ),
            Heroe(
                nombre = R.string.heroe_2,
                imagenId = R.drawable.spiderman,
                descripcion = R.string.descripcion_heroe_2
            ),
            Heroe(
                nombre = R.string.heroe_3,
                imagenId = R.drawable.batman,
                descripcion = R.string.descripcion_heroe_3
            ),
            Heroe(
                nombre = R.string.heroe_4,
                imagenId = R.drawable.dani_boy,
                descripcion = R.string.descripcion_heroe_4
            ),
            Heroe(
                nombre = R.string.heroe_5,
                imagenId = R.drawable.pantallazo_azul,
                descripcion = R.string.descripcion_heroe_5
            ),
            Heroe(
                nombre = R.string.heroe_6,
                imagenId = R.drawable.porrista,
                descripcion = R.string.descripcion_heroe_6
            )
        )
        return heroes

    }





}