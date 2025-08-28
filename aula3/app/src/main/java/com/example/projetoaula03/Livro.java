package com.example.projetoaula03;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPubicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPubicacao;
    }

    public String getInfo() {
        return "Título: "+ titulo + "Autor: "+ autor + "Ano Publicação: "+ anoPublicacao;
    }
}