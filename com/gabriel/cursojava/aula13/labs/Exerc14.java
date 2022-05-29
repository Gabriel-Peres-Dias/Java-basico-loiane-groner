package com.gabriel.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc14 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho do arquivo para download em MB "+
        "e a velocidade do link da Internet em Mbps:");
        double tamanhoArquivo = scan.nextDouble();
        double velocidadeDownload = scan.nextDouble();
        double tempoEstimado = (tamanhoArquivo / velocidadeDownload) * 60;
        System.out.println("Tempo estimado para o download são " + tempoEstimado + " minutos.");

    }
}
