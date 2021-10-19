/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi1.exemploslogica;

/**
 *
 * @author ftsuda
 */
public class ExemploOperadoresPrecedencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 8 / 2 * (2 * 2) = ?
        float resultado = 8 / 2 * (2 * 2);
        System.out.println("Resulado 1: " + resultado);
        
        float resultado2 = -3 + 3 * 3 + 3 / 3 + 3;
        System.out.println("Resultado 2: " + resultado2);
    }
    
}
