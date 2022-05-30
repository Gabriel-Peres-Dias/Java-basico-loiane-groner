package com.gabriel.cursojava.aula24.labs;

public class TestaLampada {
    
    public static void main(String[] args) {
        
        Lampada lampada = new Lampada();

        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.potencia = 7;
        lampada.garantiaMeses = "36 Meses";
        lampada.cor = "Branca";
        lampada.tipoLuz = "Branca(branca)";
        
        System.out.println("Modelo: " + lampada.modelo);
        System.out.println("Tensão: " + lampada.tensao);
        System.out.println("Garantia em meses: " + lampada.garantiaMeses);
        System.out.println("Potência: " + lampada.potencia);
        System.out.println("Cor: " + lampada.cor);
        System.out.println("Tipo de luz: " + lampada.tipoLuz);
    }
}
