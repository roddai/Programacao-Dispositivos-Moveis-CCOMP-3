package com.example.myapplication;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

public Livro(String titulo, String autor, int anoPublicacao) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;

}
//metodo getInfo() é um método que retorna o valor de um objeto remoto
// (ex: uma imagem, coleção, etc.) para que você possa usá-lo localmente em seu código.
public String getInfo;{
    return "titulo" + titulo + "autor" + autor +"anoPublicacao" + anoPublicacao;
    }
}