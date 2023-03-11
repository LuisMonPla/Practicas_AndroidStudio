package com.example.contador01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var cont:Int = 0
    var bandera = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cont = 0
        bandera = true

        val txtValor = findViewById<TextView>(R.id.twvalor)
        //val txtBandera = findViewById<TextView>(R.id.txtbandera)
        val btnContador = findViewById<Button>(R.id.btncontar)
        val btnReiniciar = findViewById<Button>(R.id.btnreiniciar)

        btnContador.setOnClickListener{
           // Toast.makeText(this, "presiono", Toast.LENGTH_LONG).show()
           // cont = cont.inc()

            if(cont  == 0)
                bandera = true
           else if(cont == 10)
                bandera = false

            if(bandera == true)
                cont = cont.inc()
            else if(bandera == false)
                cont = cont.dec()

            txtValor.text = "$cont"
            //txtBandera.text = "$bandera"


    }
        btnReiniciar.setOnClickListener{
            cont = 0
            bandera = true
            txtValor.text = "$cont"
        }
    }
}