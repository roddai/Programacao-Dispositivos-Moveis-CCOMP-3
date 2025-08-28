package com.example.sodaerro_onerb;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro (String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    public String getInfo() {
        return "Título: " + titulo+ "\n" + "Autor: " + autor + "\n" + "Ano de Publicação: " + anoPublicacao;
    }


}
