package com.example.pantallas_avance

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager


class MainActivity : AppCompatActivity() {

var mensajes: List<ListaDeMensajesKot> = listOf(
    ListaDeMensajesKot( "Pedro Ramirez", "Que onda, unas guamas?", "22:16"),
            ListaDeMensajesKot( "Cristiano Ronaldo", "Pasame la tarea we", "20:55"),
            ListaDeMensajesKot( "Samuel Garcia", "Un pito es un voto", "13:04"))



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }







}