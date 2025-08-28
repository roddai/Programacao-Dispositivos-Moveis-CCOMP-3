package com.example.eric_aula03;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getinfo(){
        return("Nome do livro: " + titulo + "\nAutor: " + autor + "\nAno de publicação: " + ano);
    }
}


