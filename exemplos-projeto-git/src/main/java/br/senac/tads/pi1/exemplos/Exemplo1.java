/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi1.exemplos;

import java.util.Scanner;

/**
 *
 * @author ftsuda
 */
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            for (int i = 1; i <= 10; i++) {
                if (i == 1) {
                    System.out.println("Hello world with Git");
                }
                System.out.println("Salve salve " + i);
            }
            System.out.println("Escutem As Patroas");

            System.out.println("Digite seu nome:");
            String nome = entrada.nextLine();
            System.out.println("Olá " + nome);
            System.out.println("Tchau " + nome);
        }

    }

}
