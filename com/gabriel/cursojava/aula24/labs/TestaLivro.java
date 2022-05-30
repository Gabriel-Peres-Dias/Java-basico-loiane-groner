package com.gabriel.cursojava.aula24.labs;

public class TestaLivro {
    
    public static void main(String[] args) {
        
        Livro livro = new Livro();

        livro.nome = "Arte da guerra";
        livro.autor = "From China";
        livro.anoLancamento = 1900;
        livro.qtdPaginas = 200;

        System.out.println("Nome do livro: " + livro.nome);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Ano de lançamento: " + livro.anoLancamento);
        System.out.println("Quantidade de páginas: " + livro.qtdPaginas);
    }
}
