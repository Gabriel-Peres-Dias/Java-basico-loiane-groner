package com.gabriel.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc7 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tamanho do lado do quadrado: ");
        double lado = scan.nextDouble();
        double area = Math.pow(lado, 2);
        double dobro = area * 2;
        System.out.println("O dobro da área do quadrado é: " + dobro);
    }
}
