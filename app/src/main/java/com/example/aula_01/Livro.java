package com.example.aula_01;

public class Livro {
    private final String titulo;
    private final String autor;
    private final int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getInfo() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nAno: " + ano;
    }

    // Getters opcionais
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAno() { return ano; }
}
