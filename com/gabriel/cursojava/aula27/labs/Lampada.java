package com.gabriel.cursojava.aula27.labs;

public class Lampada {
    
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    String garantiaMeses;
    String[] tipos;
    boolean tipoAbajour;

    boolean ligada;

    void ligar(){
        ligada = true;
    }

    void desligar(){
        ligada = false;
    }
    void mostrarEstado(){
    if(ligada){
        System.out.println("Lâmpada está ligada." );
     } else {
        System.out.println("Lâmpada está desligada");
     }
    }


    void mudarEstado(){
        if(ligada){
            desligar();
        } else {
            ligar();
        }
    }
}
