package com.example.aula03exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Ex6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex6)

        val fahrenheit : EditText = findViewById(R.id.editTextKelvin)
        val botao : Button = findViewById(R.id.buttonConverterKelvin)
        //val f = 32
        val textResultado : TextView = findViewById(R.id.textViewResultado)

        botao.setOnClickListener {
            val fahrenheit = fahrenheit.text.toString().toDouble()
            val resultado = (fahrenheit - 32) * 5/9 + 273.15
            val cxResultado = textResultado.setText("O valor em Kelvin é: " + resultado.toString())
        }
    }
}