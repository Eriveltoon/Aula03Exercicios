package com.example.aula03exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class Ex4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex4)

        val ladoA : EditText = findViewById(R.id.editTextLadoA)
        val ladoB : EditText = findViewById(R.id.editTextLadoB)
        val ladoC : EditText = findViewById(R.id.editTextLadoC)
        val botao : Button = findViewById(R.id.buttonCalcularTriangulo)

        botao.setOnClickListener {
            val valor1 = ladoA.text.toString().toInt()
            val valor2 = ladoB.text.toString().toInt()
            val valor3 = ladoC.text.toString().toInt()

            if ((valor1 == valor2) && valor1 == valor3)
            {
                alert("Errado")
            }else if ((valor1 == valor2) && valor1 != valor3){
                alert("Errado")
            }else if ((valor1 != valor2) && (valor1 != valor3) && (valor2 != valor3)){
                alert("Parabéns Triângulo Escaleno")
            }
        }
    }
    fun alert(msg:String){
        AlertDialog.Builder(this)
            .setMessage(msg)
            .setPositiveButton("OK",null)
            .create()
            .show()
    }
}