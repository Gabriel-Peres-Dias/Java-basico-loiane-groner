package com.gabriel.cursojava.aula14;

import java.util.Scanner;

public class IfElse {
    
        public static void main(String[] args) {
            
            Scanner scan = new Scanner(System.in);

            System.out.println("Entre com sua idade: ");
            int idade = scan.nextInt();

            if(idade >= 18) {
                System.out.println("É maior de idade!");
            } else {
                System.out.println("Não é maior de idade!");
            }

            System.out.println("Entre com um valor do produto:");
            double valor = scan.nextDouble();

            if(valor <= 10){
                System.out.println("Está barato.");
            } else if(valor > 10 && valor < 15){
                System.out.println("Pede um desconto ai.");
            } else if(valor >= 15 && valor < 17){
                System.out.println("Pesquisa mais.");
            } else {
                System.out.println("Caro pra caralho ein.");
            }
        }
}
