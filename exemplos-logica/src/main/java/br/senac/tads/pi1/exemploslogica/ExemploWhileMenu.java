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
public class ExemploWhileMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int codDigitado = 100;
            while (codDigitado != 0) {
                System.out.println("Digite um número de 1 a 10 OU 0 para sair:");
                String codDigitadoStr = entrada.nextLine();
                codDigitado = Integer.parseInt(codDigitadoStr);
                if (codDigitado != 0) {
                    System.out.println("Código digitado: " + codDigitadoStr + " - Fica no menu");
                }
            }
            System.out.println("Bye");
        }
    }
    
}
