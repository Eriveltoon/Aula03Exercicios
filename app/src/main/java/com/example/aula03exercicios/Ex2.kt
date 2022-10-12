package com.example.aula03exercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class Ex2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex2)

        val valor: EditText = findViewById(R.id.valor)
        val exibir: Button = findViewById(R.id.exibir)

        exibir.setOnClickListener {
            val valor = valor.text.toString().toInt()

            if (valor == 0){
                showDialog("O numero digitado é Zero")
            }else if(valor % 2 == 1 )
            {
                showDialog("O número é ímpar")
            }else {
                showDialog("O número é par")
            }
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