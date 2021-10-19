package br.senac.tads.pi1.exemploslogica;

import java.util.Scanner;

/**
 *
 * @author ftsuda
 */
public class ExemploInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // O recurso "entrada" ficará aberto dentro do bloco de código
        // e será fechado automaticamente quando o bloco encerrar
        // (ver try-with-resources - após Java 7)
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite seu nome:");
            String nome = entrada.nextLine(); // Lê da entrada texto digitado até o <ENTER>
            System.out.println("O nome digitado foi " + nome);
            
            System.out.println("Digite o ano do nascimento");
            int anoNascimento = entrada.nextInt(); // Lê da entrada valor numérico sem casa decimal
            System.out.println("O ano digitado foi " + anoNascimento);
        }
            
    }
    
}
