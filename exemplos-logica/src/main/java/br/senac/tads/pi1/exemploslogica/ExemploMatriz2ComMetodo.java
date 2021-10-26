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
public class ExemploMatriz2ComMetodo {

    public static void preencherValores(int[][] matriz, Scanner entrada) {
        for (int i = 0; i < matriz.length; i++) { // Percorre linhas
            for (int j = 0; j < matriz[i].length; j++) { // Percorre posições dentro da linha
                System.out.println("Digite o valor para a posição [" + i + "][" + j + "]: ");
                String valorStr = entrada.nextLine();
                matriz[i][j] = Integer.parseInt(valorStr);
            }
        }
    }

    public static void imprimirValores(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Valor na posição [" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }
    }

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

            preencherValores(matriz, entrada);
            
            imprimirValores(matriz);
            
            System.out.println("===============================");
            
            int[][] matriz2 = new int[][] {
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 },
                { 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 },
            };
            
            imprimirValores(matriz2);

        }
    }

}
