package com.example.aula03exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class Ex3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex3)

        val editValor1: EditText = findViewById(R.id.editTextValor1)
        val editValor2: EditText = findViewById(R.id.editTextValor2)
        val buttonSomar: Button = findViewById(R.id.buttonSomar)
        val buttonSubtrair: Button = findViewById(R.id.buttonSubtrair)
        val buttonMultiplicar: Button = findViewById(R.id.buttonMultiplicar)
        val buttonDividir: Button = findViewById(R.id.buttonDividir)

        buttonSomar.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt()
            val valor2 = editValor2.text.toString().toInt()

            val resultado = valor1 + valor2

            showDialog("A soma é " + resultado)
        }

        buttonSubtrair.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt()
            val valor2 = editValor2.text.toString().toInt()
            val resultado = valor1 - valor2

            showDialog("O resultado " + resultado)
        }

        buttonMultiplicar.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt()
            val valor2 = editValor2.text.toString().toInt()

            val resultado = valor1 * valor2

            showDialog("O resultado é " + resultado)
        }

        buttonDividir.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt()
            val valor2 = editValor2.text.toString().toInt()

            val resultado = valor1 / valor2

            showDialog("O resultado é " + resultado)
        }

    }
    fun showDialog(msg: String){
        AlertDialog.Builder(this)
            .setMessage(msg)
            .setPositiveButton("OK",null)
            .create()
            .show()
    }
}