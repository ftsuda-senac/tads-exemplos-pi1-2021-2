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
public class ExemploVetor2 {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int x1 = 34;
            System.out.println("Valor da variavel x1 = " + x1);

            int x2 = 60;
            System.out.println("Valor da variavel x2 = " + x2);

            System.out.println("==============================");
            System.out.println("Digite o tamanho do vetor: ");
            String valor = entrada.nextLine();

            int tamanhoVetor = Integer.parseInt(valor);

            int[] vetor = new int[tamanhoVetor];
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Digite o valor do vetor no índice " + i + ":");
                String valorVetor = entrada.nextLine();
                vetor[i] = Integer.parseInt(valorVetor);
            }

            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Valor do vetor no índice " + i + " = " + vetor[i]);
            }

        }
    }
}
