package com.gabriel.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc11 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe dois números inteiros e um real:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        double real = scan.nextDouble();
        int produto = (num1 * 2 ) * num2 / 2;
        double soma = num1 * 3 + real;
        double cubo = Math.pow(real, 3);
        System.out.println("--Resultado das operações--");
        System.out.println("Produto do dobro do primeiro com metade do segundo: " + produto);
        System.out.println("A soma do triplo do primeiro com o terceiro: " + soma);
        System.out.println("O terceiro elevado ao cubo: " + cubo);
        

    }
}
