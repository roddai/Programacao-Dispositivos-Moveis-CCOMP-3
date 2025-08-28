package com.example.projetoaula03;



import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Livro livro1, livro2, livro3;

        livro1 = new Livro("Desenvolvendo seu Primeiro Aplicativo Android - 2ª Edição", "Luiz Carlos Querino Filho", 2017);
        livro2 = new Livro("Programando o Android - 2ª Edição", "Zigurd Mednieks", 2012);
        livro3 = new Livro("Desenvolvimento Android para Iniciantes: Construa telas de aplicativos Android aprendendo do zero", "Ivo de Abreu Araújo", 2021);

TextView textInfo = findViewById(R.id.textInfo);

        Button button1 = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        button1.setOnClickListener(v -> textInfo.setText(livro1.getInfo()));
        button2.setOnClickListener(v -> textInfo.setText(livro2.getInfo()));
        button3.setOnClickListener(v -> textInfo.setText(livro3.getInfo()));
    }
}