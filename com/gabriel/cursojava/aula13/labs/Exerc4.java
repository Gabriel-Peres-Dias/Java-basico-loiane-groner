package com.gabriel.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc4 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe suas 4 notas bimestrais: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        double num4 = scan.nextDouble();
        double media = (num1 + num2 + num3 + num4) / 4;
        System.out.println("Sua média bimestral foi: " + media);
    }
}
