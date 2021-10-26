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
public class ExemploMatriz2 {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            int tamanhoLinhas;
            int tamanhoPosicoes;

            if (args.length == 2) {
                // Recupera os valores informados como argumentos do programa na inicialização
                // Ex: java ExemploMatriz2 3 5
                tamanhoLinhas = Integer.parseInt(args[0]);
                tamanhoPosicoes = Integer.parseInt(args[1]);
            } else {
                // Significa que precisa pedir ao usuário digitar qtde de linhas
                // e colunas da matriz
                System.out.println("Digite quantidade de linhas da matriz: ");
                String tamanhoStr = entrada.nextLine();
                tamanhoLinhas = Integer.parseInt(tamanhoStr);

                System.out.println("Digite quantidade de posições por linha: ");
                tamanhoStr = entrada.nextLine();
                tamanhoPosicoes = Integer.parseInt(tamanhoStr);
            }

            int[][] matriz = new int[tamanhoLinhas][tamanhoPosicoes];

            for (int i = 0; i < matriz.length; i++) { // Percorre linhas
                for (int j = 0; j < matriz[i].length; j++) { // Percorre posições dentro da linha
                    System.out.println("Digite o valor para a posição [" + i + "][" + j + "]: ");
                    String valorStr = entrada.nextLine();
                    matriz[i][j] = Integer.parseInt(valorStr);
                }
            }

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.println("Valor na posição [" + i + "][" + j + "] = " + matriz[i][j]);
                }

            }
        }
    }

}
