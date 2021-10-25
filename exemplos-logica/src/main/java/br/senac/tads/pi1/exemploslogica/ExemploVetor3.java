/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi1.exemploslogica;

import java.util.Scanner;

/**
 *
 * @author ftsuda
 */
public class ExemploVetor3 {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            
            System.out.println("Digite o tamanho do vetor: ");
            String tamanhoStr = entrada.nextLine();
            
            int tamanho = Integer.parseInt(tamanhoStr);
            String vetor[] = new String[tamanho]; // OU String[] vetor = new String[tamanho]; - NOTAR POSIÇÃO DOS COLCHETES
            
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Digite o valor no índice " + i + ":");
                String valor = entrada.nextLine();
                vetor[i] = valor;
            }
            
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Valor no índice " + i + " = " + vetor[i]);
            }

        }
    }
    
}
