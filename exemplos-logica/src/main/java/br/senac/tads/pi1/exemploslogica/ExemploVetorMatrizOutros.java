/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi1.exemploslogica;

/**
 *
 * @author ftsuda
 */
public class ExemploVetorMatrizOutros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Exemplo vetor zerado via for");
        int[] vetor1 = new int[10];
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = 0;
        }

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Valor do vetor no índice " + i + " = " + vetor1[i]);
        }

        System.out.println("===========================");

        System.out.println("Exemplo vetor inicializado na declaração");
        int[] vetorInicializado = new int[]{0, 10, 25, 36, 67, 78, 99, 101, 120, 187, 201};

        for (int i = 0; i < vetorInicializado.length; i++) {
            System.out.println("Valor do vetor no índice " + i + " = " + vetorInicializado[i]);
        }

        System.out.println("===========================");

        System.out.println("Exemplo matriz inicializada na declaração");
        int[][] matrizInicializada = new int[][]{
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
            {0, 2, 4, 6, 8, 10, 12, 14, 16, 18},
            {0, 3, 6, 9, 12, 15, 18, 21, 24, 27}
        };

        for (int i = 0; i < matrizInicializada.length; i++) {
            for (int j = 0; j < matrizInicializada[i].length; j++) {
                System.out.println("Valor na posição [" + i + "][" + j + "] = " + matrizInicializada[i][j]);
            }
        }

    }

}
