package com.example.eric_aula03;


import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Livro livro1, livro2, livro3;

        livro1 = new Livro("Desenvolvendo seu primeiro APlicativo", "Ericson", 2024);
        livro2 = new Livro("Desenvolvendo seu primeiro APlicativo", "Ericvon", 2024);
        livro3 = new Livro("Desenvolvendo seu primeiro APlicativo", "Ericton", 2024);

        TextView textInfo = findViewById(R.id.textInfo);


        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        button1.setOnClickListener(v -> textInfo.setText(livro1.getinfo()));
        button2.setOnClickListener(v -> textInfo.setText(livro2.getinfo()));
        button3.setOnClickListener(v -> textInfo.setText(livro3.getinfo()));
    }

}