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
public class ExemploFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("[Exemplo for] Digite o número para cálculo da tabuada: ");
            
            String numeroStr = entrada.nextLine();
            int numero = Integer.parseInt(numeroStr);

            /*
            int fator = 1;
            while (fator < 11) {
                int resultado = numero * fator;
                System.out.println("" + numero + " x " + fator + " = " + resultado);
                fator = fator + 1; // OU fator += 1 OU fator++
            }
            */
            for (int fator = 1; fator < 11; fator++) {
                int resultado = numero * fator;
                System.out.println("" + numero + " x " + fator + " = " + resultado);
            }
        }
    }
    
}
