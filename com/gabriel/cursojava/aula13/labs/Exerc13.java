package com.gabriel.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc13 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? E seu número de horas trabalhadas por mês?");
        double ganhoHora = scan.nextDouble();
        double horasMes = scan.nextDouble();
        double salarioBruto = ganhoHora * horasMes;

        double impostoRenda = (salarioBruto * 0.11);
        double INSS = (salarioBruto * 0.08);
        double sindicato = (salarioBruto * 0.05);
        double salarioLiquido = salarioBruto - impostoRenda - INSS - sindicato;

        System.out.println("---Dados sobre seu Salário---");
        System.out.println("Sálario Bruto: " + salarioBruto);
        System.out.println("Valor pago do Imposto de renda: " + impostoRenda);
        System.out.println("Valor pago ao INSS: " + INSS);
        System.out.println("Valor pago ao Sindicato: " + sindicato);
        System.out.println("Sálario Liquido: " + salarioLiquido);
        
    }
}
