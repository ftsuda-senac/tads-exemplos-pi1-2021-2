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
public class ExemploMatriz {
    
    public static void main(String[] args) {
        
        int[] vetor1 = new int[3];
        vetor1[0] = 1;
        vetor1[1] = 2;
        vetor1[2] = 4;
        
        int[] vetor2 = new int[3];
        vetor2[0] = 4;
        vetor2[1] = 6;
        vetor2[2] = 8;
        
        System.out.println("Valores do vetor1: índice 0 = " + vetor1[0] + ", índice 1 = " + vetor1[1] + ", índice 2 = " + vetor1[2]);
        System.out.println("Valores do vetor2: índice 0 = " + vetor2[0] + ", índice 1 = " + vetor2[1] + ", índice 2 = " + vetor2[2]);
        
        System.out.println("============================");
        
        int[][] matriz = new int[2][3];
        
        // Valores da linha 1 (índice 0)
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 4;
        // Valores da linha 2 (índice 1)
        matriz[1][0] = 4;
        matriz[1][1] = 6;
        matriz[1][2] = 8;
        
        System.out.println("Valor da matriz na linha índice 0, posição 0 = " + matriz[0][0]);
        System.out.println("Valor da matriz na linha índice 0, posição 1 = " + matriz[0][1]);
        System.out.println("Valor da matriz na linha índice 0, posição 2 = " + matriz[0][2]);
        System.out.println("Valor da matriz na linha índice 1, posição 0 = " + matriz[1][0]);
        System.out.println("Valor da matriz na linha índice 1, posição 1 = " + matriz[1][1]);
        System.out.println("Valor da matriz na linha índice 1, posição 2 = " + matriz[1][2]);
        
    }
    
}
