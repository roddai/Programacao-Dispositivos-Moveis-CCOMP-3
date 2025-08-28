package com.example.aula

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var editNome: EditText? = null
    private var btnEnviar: Button? = null

    @Override
    protected fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Layout da primeira tela

        editNome = findViewById(R.id.editNome)
        btnEnviar = findViewById(R.id.btnEnviar)

        btnEnviar.setOnClickListener(object : OnClickListener() {
            @Override
            fun onClick(v: View?) {
                val nomeDigitado: String = editNome.getText().toString()

                val irParaSegundaTela: Intent = Intent(
                    this@MainActivity,
                    SegundaActivity::class.java
                )
                irParaSegundaTela.putExtra("nomeUsuario", nomeDigitado)
                startActivity(irParaSegundaTela)
            }
        })
    }
}