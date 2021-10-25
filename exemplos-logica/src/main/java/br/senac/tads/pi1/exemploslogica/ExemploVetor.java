/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi1.exemploslogica;


public class ExemploVetor {

    public static void main(String[] args) {
        int x1 = 34;
        System.out.println("Valor da variavel x1 = " + x1);
        
        int x2 = 60;
        System.out.println("Valor da variavel x2 = " + x2);
        
        System.out.println("==============================");
        
        int[] vetor = new int[5];
        vetor[0] = 5; // <-- LEMBRAR QUE INDICE COMEÇA NA POSIÇÃO 0
        vetor[1] = 8;
        vetor[2] = 14;
        vetor[3] = 23;
        vetor[4] = 30;
 
        System.out.println("Valor do vetor na posicao 0 = " + vetor[0]);
        System.out.println("Valor do vetor na posicao 1 = " + vetor[1]);
        System.out.println("Valor do vetor na posicao 2 = " + vetor[2]);
        System.out.println("Valor do vetor na posicao 3 = " + vetor[3]);
        System.out.println("Valor do vetor na posicao 4 = " + vetor[4]);

    }
    
}
