package com.example.projetobrunoaula01;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Livro livro1, livro2, livro3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        livro1 = new Livro("Desenvolvimento Android para Iniciantes: Construa telas de aplicativos Android aprendendo do zero", "Ivo de Abreu Araújo", 2021);
        livro2 = new Livro("Programando o Android - 2ª Edição", "Zigurd Mednieks", 2016);
        livro3 = new Livro("Desenvolvimento de Aplicativos. Um Guia Prático Para Criar Aplicativos com Ionic", "Erik Ieger Dobrychtop", 2018);

        TextView textInfo = findViewById(R.id.textInfo);

        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        button.setOnClickListener(v -> textInfo.setText(livro1.getInfo()));
        button2.setOnClickListener(v -> textInfo.setText(livro2.getInfo()));
        button3.setOnClickListener(v -> textInfo.setText(livro3.getInfo()));


    }
}