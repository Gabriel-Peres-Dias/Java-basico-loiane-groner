package com.gabriel.cursojava.aula27;

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

        double km = 10;
        System.out.println("Quantidade de combustível consumida foi: " + carro.calcularCombustivel(km));
    }
}
