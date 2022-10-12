package com.example.aula03exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class Ex5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex5)

        val pes = 3.2808399
        val editTextMetro : EditText = findViewById(R.id.editTextMetro)
        val buttonConverterMetro : Button = findViewById(R.id.buttonConverterMetro)

        buttonConverterMetro.setOnClickListener {
            val valor = editTextMetro.text.toString().toDouble()
            val resultado = (valor * pes)

            alert("Valor em metros $resultado")
        }
    }

    fun alert (msg: String){
        AlertDialog.Builder(this)
            .setMessage(msg)
            .setPositiveButton("OK",null)
            .create()
            .show()
    }
}