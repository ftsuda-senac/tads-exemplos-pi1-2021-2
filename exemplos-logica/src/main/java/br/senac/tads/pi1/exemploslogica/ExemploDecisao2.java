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
public class ExemploDecisao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite seu consumo em KWh:");
            int consumo = entrada.nextInt();
            
            // OBS: LEMBRAR QUE CÁLCULOS COM VALORES DECIMAIS EXATOS
            // COMO PRECO DEVEM SER FEITOS USANDO BigDecimal!!!
            float precoUnitario;
            if (consumo < 150) {
                precoUnitario = 0.2f;
            } else if (consumo >= 150 && consumo < 500) {
                precoUnitario = 0.25f;
            } else {
                precoUnitario = 0.3f;
            }
            float precoFinal = consumo * precoUnitario;
            System.out.println("Preco do KWh a pagar: " + precoUnitario);

        }
    }
    
}
