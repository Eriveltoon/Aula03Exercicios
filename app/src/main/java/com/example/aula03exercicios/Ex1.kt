package com.example.aula03exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog


class Ex1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex1)

        val editTextNome : EditText = findViewById(R.id.editTextNome)
        val editTextSobrenome : EditText = findViewById(R.id.editTextSobrenome)
        val buttonExibir : Button = findViewById(R.id.buttonExibir)

        buttonExibir.setOnClickListener {

            val valor1 = editTextNome.text.toString()
            val valor2 = editTextSobrenome.text.toString()

            val resultado = valor1 + " " + valor2
            showDialog("Olá $resultado")
        }
    }
    fun showDialog(msg: String){
        AlertDialog.Builder(this)
            .setTitle("Bem Vindo")
            .setMessage(msg)
            .setPositiveButton("OK",null)
            .create()
            .show()
    }
}