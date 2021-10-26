/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi1.exemploslogica;

import java.security.SecureRandom;

public class ExemploMetodos {
    

    public static void main(String[] args) {

        mostrarMensagem();
        
        int x = 2;
        int r = somar(x, 5);
        System.out.println("Resultado do somar(x,5) = " + r);

        mostrarMensagemComArgumento("Mensagem gerada no main()");
        
        int aleatorio = gerarNumeroAleatorio();
        System.out.println("Número aleatório: " + aleatorio);

        mostrarMensagem();
    }
    
    public static int somar(int a, int b) {
        int resultado = a + b;
        return resultado;
        //return a + b;
    }
    
    public static int gerarNumeroAleatorio() {
        SecureRandom random = new SecureRandom();
        int numeroAleatorio = random.nextInt(10); // Gera aleatorio de 0 a 9
        return numeroAleatorio;
        //return random.nextInt(10);
    }
    
    public static void mostrarMensagem() {
        System.out.println("Titulo");
        System.out.println("Mensagem");
        System.out.println("Bla bla bla alterada");
        System.out.println("\n");
    }
    
    public static void mostrarMensagemComArgumento(String mensagemAdicional) {
        System.out.println("Titulo");
        System.out.println("Mensagem");
        System.out.println(mensagemAdicional);
        System.out.println("\n");
    }

}
