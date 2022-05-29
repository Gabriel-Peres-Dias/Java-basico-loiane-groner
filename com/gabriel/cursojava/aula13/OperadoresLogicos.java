package com.gabriel.cursojava.aula13;

public class OperadoresLogicos {
    
    public static void main(String[] args) {                                   
        
        int valor1 = 1;
        int valor2 = 2;

        // Operador AND
        boolean resultado1 = (valor1 == 1) && (valor2 == 2);
        System.out.println("valor 1 é 1 AND valor 2 é 2 - resultado: " + resultado1);

        // Operador OR
        boolean resultado2 = (valor1 == 1) || (valor2 == 2);
        System.out.println("valor 1 é 1 OR  valor 2 é 2 - resultado: " + resultado2);

        // Tabela verdade moral
        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro  ^ falso);
        System.out.println(!verdadeiro && falso);
    }
}
