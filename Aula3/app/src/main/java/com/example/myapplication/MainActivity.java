package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Livro Livro1, Livro2, Livro3;

        Livro1 = new Livro("Desenvolvendo seu Primeiro Aplicativo Android", "Luiz Carlos", 2017 );
        Livro2 = new Livro("Livro2 ", "aut2", 2017 );
        Livro3 = new Livro("Livro3 ", "aut3", 2017 );

        textView textInfo = findViewById(R.id.textInfo);

        Button button1 = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        button1.setOnClickListener(v -> textInfo.setText(Livro1.getInfo));
        button2.setOnClickListener(v -> textInfo.setText(Livro2.getInfo));
        button3.setOnClickListener(v -> textInfo.setText(Livro3.getInfo));

    }
}