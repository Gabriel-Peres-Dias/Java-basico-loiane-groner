package com.gabriel.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc8 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Qaunto você ganha por hora? E quantas horas "+
        "trabalha por mês?");
        double ganhoHora = scan.nextDouble();
        double horaMes = scan.nextDouble();
        double salario = ganhoHora * horaMes;
        System.out.println("Você ganhou  " + salario + " reais neste mês.");
    }
}
