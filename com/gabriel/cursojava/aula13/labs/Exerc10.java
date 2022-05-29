package com.gabriel.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc10 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos graus Celcius está fazendo agora?");
        double grausCelcius = scan.nextDouble();
        double grausFarenheit = grausCelcius * 1.8 + 32;
        System.out.println("Está fazendo " + grausFarenheit + " graus em Farenheit no momento.");
    }
}
