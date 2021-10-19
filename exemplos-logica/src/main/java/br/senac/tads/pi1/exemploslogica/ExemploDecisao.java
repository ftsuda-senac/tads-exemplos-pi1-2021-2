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
public class ExemploDecisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            String temSol;
            String estaChovendo;
            int quantoDinheiro;
            
            System.out.println("**** VERIFICAR SE VAI TER PRAIA (Guarujá) OU NÃO");
            // Verificar se vai ter praia ou não
            System.out.println("Tem sol? (S/N)");
            temSol = entrada.nextLine();
            System.out.println("Está chovendo? (S/N)");
            estaChovendo = entrada.nextLine();
            System.out.println("Tem quanto dinheiro?");
            quantoDinheiro = entrada.nextInt();
            
            // temSol == "S" --> NAÕ PODE SER FEITO PARA STRINGS
            boolean decisao = temSol.equalsIgnoreCase("s")
                    && estaChovendo.equalsIgnoreCase("n")
                    && quantoDinheiro >= 3000;
            
            if (decisao == true) {
                System.out.println("Resultado: Tem praia");
            } else {
                System.out.println("Resultado: Não tem praia");
            }
            
        }
    }
    
}
