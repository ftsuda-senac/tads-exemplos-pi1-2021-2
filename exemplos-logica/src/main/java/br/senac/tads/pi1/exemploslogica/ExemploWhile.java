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
public class ExemploWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("[Exemplo while] Digite o número para cálculo da tabuada: ");
            
            String numeroStr = entrada.nextLine();
            int numero = Integer.parseInt(numeroStr);

            /*
            int resultado = numero * 1;
            System.out.println("" + numero + " x 1 = " + resultado);
            resultado = numero * 2;
            System.out.println("" + numero + " x 2 = " + resultado);
            resultado = numero * 3;
            System.out.println("" + numero + " x 3 = " + resultado);
            resultado = numero * 4;
            System.out.println("" + numero + " x 4 = " + resultado);
            resultado = numero * 5;
            System.out.println("" + numero + " x 5 = " + resultado);
            resultado = numero * 6;
            System.out.println("" + numero + " x 6 = " + resultado);
            resultado = numero * 7;
            System.out.println("" + numero + " x 7 = " + resultado);
            resultado = numero * 8;
            System.out.println("" + numero + " x 8 = " + resultado);
            resultado = numero * 9;
            System.out.println("" + numero + " x 9 = " + resultado);
            resultado = numero * 10;
            System.out.println("" + numero + " x 10 = " + resultado);
            */
            
            int fator = 1;
            while (fator < 11) {
                int resultado = numero * fator;
                System.out.println("" + numero + " x " + fator + " = " + resultado);
                fator = fator + 1; // OU fator += 1 OU fator++
            }
        }
    }
    
}
