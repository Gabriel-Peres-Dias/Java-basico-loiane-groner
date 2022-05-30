package com.gabriel.cursojava.aula24.labs;

public class TestaLivroLivraria {
    
    public static void main(String[] args) {
        
        LivroLivraria livrolivraria = new LivroLivraria();

        livrolivraria.nome = "Eita Bixo";
        livrolivraria.autor = "Filosofo Piton";
        livrolivraria.anoLancamento = 01;
        livrolivraria.qtdPaginas = 1;
        livrolivraria.valor = 1000;

        System.out.println("Nome do livro: " + livrolivraria.nome);
        System.out.println("Autor: " + livrolivraria.autor);
        System.out.println("Ano de lançamento: " + livrolivraria.anoLancamento);
        System.out.println("Quantidade de páginas: " + livrolivraria.qtdPaginas);
        System.out.println("Preço: " + livrolivraria.valor);
    }
}
