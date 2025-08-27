package com.example.projetoaula01;


import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Livro livro1, livro2, livro3;

        livro1 = new Livro("Desenvolvimento Android para Iniciantes", "Ivo Abreu", 2021);
        livro2 = new Livro("Desenvolvimento Android para Mestres", "Eric Bittu", 2025);
        livro3 = new Livro("Desenvolvimento Android", "Arthur", 2015);

        TextView textInfo = findViewById(R.id.textInfo);

        Button button1 = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        button1.setOnClickListener(V -> textInfo.setText(livro1.getinfo()));
        button2.setOnClickListener(V -> textInfo.setText(livro2.getinfo()));
        button3.setOnClickListener(V -> textInfo.setText(livro3.getinfo()));
    }
}