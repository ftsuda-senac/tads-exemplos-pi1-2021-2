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
public class ExemploSwitch {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            String codQualPraiaStr;
            String temSol;
            String estaChovendo;
            int quantoDinheiro;

            System.out.println("**** VERIFICAR SE VAI TER PRAIA OU NÃO");
            System.out.println("1) Guarujá");
            System.out.println("2) Praia Grande (SP)");
            System.out.println("3) Ilhabela");
            System.out.println("4) Rio de Janeiro");
            System.out.println("Digite o código da praia:");

            codQualPraiaStr = entrada.nextLine();
            // Verificar se vai ter praia ou não
            System.out.println("Tem sol? (S/N)");
            temSol = entrada.nextLine();
            System.out.println("Está chovendo? (S/N)");
            estaChovendo = entrada.nextLine();
            System.out.println("Tem quanto dinheiro?");
            quantoDinheiro = entrada.nextInt();

            int valorMinimo;
            int codQualPraia = Integer.parseInt(codQualPraiaStr);
            switch (codQualPraia) {
                case 1: // Guaruja
                    valorMinimo = 3000;
                    break;
                case 2: // Praia Grande
                    valorMinimo = 1000;
                    break;
                case 3: // Ilhabela
                case 4: // Rio de Janeiro
                    valorMinimo = 6000;
                    break;
                default: // Praia não prevista
                    valorMinimo = 2000;
            }

            boolean decisao = temSol.equalsIgnoreCase("s")
                    && estaChovendo.equalsIgnoreCase("n")
                    && quantoDinheiro >= valorMinimo;

            if (decisao == true) {
                System.out.println("Resultado: Tem praia");
            } else {
                System.out.println("Não tem praia");
            }
        }
    }

}
