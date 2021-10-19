package br.senac.tads.pi1.exemploslogica;

/**
 * declaração Javadoc
 * Explica o que o ExemploHelloWorld faz
 * @author ftsuda
 */
public class ExemploHelloWorld {

    /**
     * Mostrar na saída a mensagem Hello World
     * @param args the command line arguments
     */
    public static void main(String[] argumentos) {
        // TODO code application logic here
        System.out.print("Exemplo de print");
        System.out.print("Hello world 1");
        System.out.print("Hello world 2");
        
        System.out.print("Exemplo de print com \\r\\n\r\n");
        System.out.print("Hello world 3\r\n"); // OU substituir por System.lineSeparator()
        System.out.print("Hello world 4\r\n");
        
        System.out.println("Exemplo println");
        System.out.println("Hello world 5");
        System.out.println("Hello world 6");
        
        
    }
    
}
