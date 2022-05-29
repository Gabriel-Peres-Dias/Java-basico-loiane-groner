package com.gabriel.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc9 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos graus Farenheit está fazendo agora?");
        double grausFarenheit = scan.nextDouble();
        double grausCelcius = (5 * (grausFarenheit - 32) / 9);
        System.out.println("Está fazendo " + grausCelcius + " graus em Celcius no momento.");
    }
}
