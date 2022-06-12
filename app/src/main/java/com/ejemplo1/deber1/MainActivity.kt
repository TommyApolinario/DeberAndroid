package com.ejemplo1.deber1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.EditText
import android.widget.RadioButton
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun btnEnviar(view: View) {
        var intent = Intent (this, Actividad2::class.java)
        var nombre: EditText? = findViewById(R.id.txtNombre) as? EditText
        var masculino: RadioButton? = findViewById(R.id.rdbMasculino) as? RadioButton
        var femenino: RadioButton? = findViewById(R.id.rdbFemenino) as? RadioButton
        var fechaNac: EditText? = findViewById(R.id.FechaNac) as? EditText
        var telefono: EditText? = findViewById(R.id.txtTelefono) as? EditText


        var b: Bundle = Bundle()

        b.putString("Nombre", nombre?.text.toString())
        b.putString("Masculino", masculino?.text.toString())
        b.putString("Femenino", femenino?.text.toString())
        b.putString("Fechanac", fechaNac?.text.toString())
        b.putString("Telefono", telefono?.text.toString())

        intent.putExtras(b)
        startActivity(intent)

    }

    }
