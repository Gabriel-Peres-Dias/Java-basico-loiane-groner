package com.gabriel.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc6 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o raio de um círculo: ");
        double raio = scan.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do Círucula é: " + area);
    }
}
