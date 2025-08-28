package com.example.sodaerro_onerb;

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

        livro1 = new Livro("Bart, o Detetive", "Matt Groening",2003);
        livro2 = new Livro("Todos contra Lisa", "Matt Groening",2001);
        livro3 = new Livro("Lisa Leroy Johnson", "Matt Groening",2002);

        TextView textInfo = findViewById(R.id.textInfo);

        Button button1 = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        button1.setOnClickListener(v -> textInfo.setText(livro1.getInfo()));
        button2.setOnClickListener(v -> textInfo.setText(livro2.getInfo()));
        button3.setOnClickListener(v -> textInfo.setText(livro3.getInfo()));


    }
}