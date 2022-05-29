package com.gabriel.cursojava.aula13;

public class OperadoresAritimeticos {
    
    public static void main(String[] args) {
        
        // Operador de adição
        int resultado = 1 + 2;
        System.out.println(resultado);

        // Operador de subtração
        resultado = resultado - 1;
        System.out.println(resultado);

        // Operador de multiplicação
        resultado = resultado * 2;
        System.out.println(resultado);

        // Operador de divisão
        resultado = resultado / 2;
        System.out.println(resultado);

        // Operador de Soma novamente
        resultado = resultado + 8;
        System.out.println(resultado);

        // Operador de Módulo (resto da divisão)
        resultado = resultado % 7;
        System.out.println(resultado);

        // Concatenação de Strings
        String primeiroNome = "Esta é";
        String segundoNome  = " uma String concatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        resultado = resultado + 1;
        System.out.println(resultado);

        // Operador de incremento
        resultado = resultado ++;
        System.out.println(resultado);

        System.out.println(resultado++);
        // Mesma coisa que
        // System.out.println(resultado + 1);
        // resultado = resultado + 1;
        // resultado += 1;

        System.out.println(++resultado);
        // Mesma coisa que
        // resultado += 1;

        // Operador de decremento
        resultado--;
        System.out.println(resultado);

        // Imprime, depois subtrai
        System.out.println(resultado--);
        
        // Subtrai, depois imprime
        System.out.println(--resultado);
    }   
}
