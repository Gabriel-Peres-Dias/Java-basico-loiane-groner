package com.gabriel.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc5 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantos metros você quer converter para centimetros: ");
        double metros = scan.nextDouble();
        double converte = (metros * 100);
        System.out.println(metros + " metros são " + converte + " centimetros.");
    }
}
