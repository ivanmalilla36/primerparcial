package com.example.egghunt3r.primerparcial

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Lay = findViewById<ConstraintLayout>(R.id.lay)

        val boton1 = findViewById<Button>(R.id.bot1)
        val boton2 = findViewById<Button>(R.id.bot2)
        val boton3 = findViewById<Button>(R.id.bot3)

        val sumar = findViewById<Button>(R.id.cinco)
        val sumar1 = findViewById<Button>(R.id.quience)
        val sumar2 = findViewById<Button>(R.id.trinta)
        val sumar3 = findViewById<Button>(R.id.cincuenta)

        var prodtotal = findViewById<EditText>(R.id.protot)
        var prodactual = findViewById<EditText>(R.id.proact)
        var porcentaje = findViewById<EditText>(R.id.por)

        boton1.setOnClickListener(View.OnClickListener {
            var produccionT = prodtotal.text.toString().toInt()
            var total = produccionT * 80
            Toast.makeText(this,"${total}",Toast.LENGTH_SHORT).show()
        })

        boton2.setOnClickListener(View.OnClickListener {
            var produccionA = prodactual.text.toString().toInt()
            var total2 = produccionA * 80
            Toast.makeText(this,"${total2}",Toast.LENGTH_SHORT).show()
        })

        boton3.setOnClickListener(View.OnClickListener {
            var produccionA = prodactual.text.toString().toInt()
            var produccionT = prodtotal.text.toString().toInt()
            var total = produccionA * 100 / produccionT
            porcentaje.setText("${total}")

            if (total >= 70) {
              Lay.setBackgroundColor(Color.RED)
            }
            else {
                Lay.setBackgroundColor(Color.WHITE)
            }

        })

        sumar.setOnClickListener(View.OnClickListener {
            var produccionA = prodactual.text.toString().toInt()
            var total2 = produccionA + 5
            prodactual.setText("${total2}")
        })

        sumar1.setOnClickListener(View.OnClickListener {
            var produccionA = prodactual.text.toString().toInt()
            var total2 = produccionA + 15
            prodactual.setText("${total2}")
        })

        sumar2.setOnClickListener(View.OnClickListener {
            var produccionA = prodactual.text.toString().toInt()
            var total2 = produccionA + 30
            prodactual.setText("${total2}")
        })

        sumar3.setOnClickListener(View.OnClickListener {
            var produccionA = prodactual.text.toString().toInt()
            var total2 = produccionA + 50
            prodactual.setText("${total2}")
        })


    }
}
