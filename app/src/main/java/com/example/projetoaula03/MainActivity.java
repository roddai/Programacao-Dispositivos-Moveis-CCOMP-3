package com.example.projetoaula03;


import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Livro livro1, livro2, livro3;

        livro1 = new Livro("1984","George Orwell", 1949);
        livro2 = new Livro("Fahrenheit 451", "Ray Bradbury", 1953);
        livro3= new Livro("Admirável Mundo Novo", "Aldous Huxley", 1932);

        TextView textInfo = findViewById(R.id.textInfo);

        Button button1 = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        button1.setOnClickListener(v -> textInfo.setText(livro1.getInfo()));
        button2.setOnClickListener(v -> textInfo.setText(livro2.getInfo()));
        button3.setOnClickListener(v -> textInfo.setText(livro3.getInfo()));

    }
}