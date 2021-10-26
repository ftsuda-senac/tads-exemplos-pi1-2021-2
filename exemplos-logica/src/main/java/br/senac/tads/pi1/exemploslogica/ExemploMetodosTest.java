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
public class ExemploMetodosTest {

    public static void main(String[] args) {
        // Teste: Verificar q 1 + 2 = 3;
        int resultado = ExemploMetodos.somar(1, 2);
        if (resultado == 3) {
            System.out.println("Resultado OK");
        } else {
            System.out.println("ERRO - Resultado foi " + resultado + " - Esperado era 3");
        }
        
    }
    
}
