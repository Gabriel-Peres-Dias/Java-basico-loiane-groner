package com.gabriel.cursojava.aula26;

public class Carro {
    
    String marca;
        String modelo;
        int numPassageiros;
        double capCombustivel;
        double consumoCombustivel;

        void exibirAutonomia(){
            System.out.println("A autonômia do carro é: " + capCombustivel * 
            consumoCombustivel + "KM");
       }

       double obterAutonomia(){
            System.out.println("Metodo obter autonomia");
            return capCombustivel * consumoCombustivel;
       }
}
