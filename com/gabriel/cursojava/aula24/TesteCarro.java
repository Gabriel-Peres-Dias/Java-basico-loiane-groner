package com.gabriel.cursojava.aula24;

public class TesteCarro {
    
    public static void main(String[] args) {
        
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println("--Informações sobre o carro--\n");
        System.out.println("Marca: "  + van.marca);
        System.out.println("Modelo: " + van.modelo);
        System.out.println("Número de passageiros: " + van.numPassageiros);
        System.out.println("Capacidade de combustível:" + van.capCombustivel);
        System.out.println("Consumo de combustível: " + van.consumoCombustivel);
        System.out.println("\n-----------------------------");

        Carro fusca = new Carro();
        fusca.marca = "Wolkswagem";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consumoCombustivel = 0.15;

        System.out.println("--Informações sobre o carro--\n");
        System.out.println("Marca: "  + fusca.marca);
        System.out.println("Modelo: " + fusca.modelo);
        System.out.println("Número de passageiros: " + fusca.numPassageiros);
        System.out.println("Capacidade de combustível:" + fusca.capCombustivel);
        System.out.println("Consumo de combustível: " + fusca.consumoCombustivel);
        System.out.println("\n-----------------------------");

    }
}
