package com.gabriel.cursojava.aula26;

public class TestaCarro {
    
    public static void main(String[] args) {
        
        Carro carro = new Carro();

        carro.marca = "Fiat";
        carro.modelo = "Ducato";
        carro.numPassageiros = 10;
        carro.capCombustivel = 100;
        carro.consumoCombustivel = 0.2;

        carro.exibirAutonomia();

        double autonomia = carro.obterAutonomia();
        System.out.println(autonomia);
    }
}
