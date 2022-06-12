package com.ejemplo1.deber1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Actividad2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad2)

        var nombre: TextView = findViewById(R.id.textNombre)
        var genero: TextView = findViewById(R.id.textGen)
        var fechanac: TextView = findViewById(R.id.textFech)
        var telefono: TextView = findViewById(R.id.textTelf)


        var bun: Bundle? = this.intent.extras
        if (bun != null)
        {
            nombre.text = bun.getString("Nombre")
            genero.text = bun.getString("Masculino")
            genero.text = bun.getString("Femenino")
            fechanac.text = bun.getString("Fechanac")
            telefono.text = bun.getString("Telefono")
        }


    }
}