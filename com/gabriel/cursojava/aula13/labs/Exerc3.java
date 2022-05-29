package com.gabriel.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc3 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe dois números: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int soma = num1 + num2;
        System.out.println("a soma dos números é: " + soma);
    }
}
