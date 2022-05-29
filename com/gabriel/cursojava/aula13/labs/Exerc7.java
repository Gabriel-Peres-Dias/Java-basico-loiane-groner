package com.gabriel.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc7 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a base e a altura do seu quadrado: ");
        double base = scan.nextDouble();
        double altura = scan.nextDouble();
        double area = base * altura;
        double dobro = area * 2;
        System.out.println("O dobro da área do quadrado é: " + dobro);
    }
}
