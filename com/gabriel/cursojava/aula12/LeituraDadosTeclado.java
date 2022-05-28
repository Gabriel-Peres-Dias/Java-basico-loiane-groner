package com.gabriel.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

    public static void main(String[] args) {
        
        //Instância do Scanner
        Scanner scan = new Scanner(System.in);

        //Lê toda a String
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome é: " + nomeCompleto);

        //Lê apenas a primeira linha da String
        System.out.println("Digite seu primeiro nome:");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        //Lê o int com scanner
        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);

        //Lê o double com scanner
        System.out.println("Digite sua altura:");
        double altura = scan.nextDouble();
        System.out.println("Sua altura é: " + altura);

        System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura, e se possui pet: ");
        String primeiroNome1 = scan.next();
        int idade1 = scan.nextInt();
        int quantidadeDeFilhos = scan.nextInt();
        double altura1 = scan.nextDouble();
        boolean pet = scan.nextBoolean();

        System.out.println("Seu primeiro nome é: " + primeiroNome1);
        System.out.println("Sua idade é: " + idade1);
        System.out.println("Quantidade de filhos: " + quantidadeDeFilhos);
        System.out.println("Sua altura é: " + altura1);
        System.out.println("Se possuí pet: " + pet);

    }
    
}
