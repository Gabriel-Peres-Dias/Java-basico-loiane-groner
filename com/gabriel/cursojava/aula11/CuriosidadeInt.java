package com.gabriel.cursojava.aula11;

public class CuriosidadeInt {

    public static void main(String[] args) {
        
        int var1 = 2147483647;

        int var2 = 1;

        // Quando o valor de um int ultrapassa do limite ele volta para o número negativo mais baixo
        System.out.println(var1 + var2);

    }
    
}
