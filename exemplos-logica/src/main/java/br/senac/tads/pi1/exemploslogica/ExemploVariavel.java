package br.senac.tads.pi1.exemploslogica;

/**
 *
 * @author ftsuda
 */
public class ExemploVariavel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensagemNatal = "Feliz Natal!!!"; // camelCase
        String OUTRA_Mensagem = "Feliz Ano novo!!!"; // <-- está correto, mas inadequado por não seguir boa pratica Java (camelCase + palavra maiúscula)
        String MaisOutraMensagem = "Feliz páscoa!!!"; // <-- está correto, mas não segue boa prática, pois a primeira letra está Maiúsucla
        
        System.out.println("Mensagem de natal: " + mensagemNatal);
        System.out.println("Outra mensagem: " + OUTRA_Mensagem);
        System.out.println("Mais outra mensagem: " + MaisOutraMensagem);
        
        int valor1 = 123;
        Integer valor2 = 123; // wrapper do tipo primitivo int
        //int valor3 = null; // Não pode fazer isso em tipos primitivos
        Integer valor4 = null;
        
        String string1 = new String("abc");
        String string2 = new String("abc");
        
        System.out.println("Comparacao 1 usando == : " + (string1 == string2));
        System.out.println("Comparacao 2 usando equals: " + string1.equals(string2));
        
        // Exemplos para ver algumas funcionalidades que podem ser usadas
        // para verificar/manipular a string.
        String str1 = "Abc";
        boolean str1igual = str1.equals("abc");
        boolean strIgual2 = str1.equalsIgnoreCase("abc");
        int qtdeCaracteres = str1.length();
        String str1Maiuscula = str1.toUpperCase();
        
        // TODO mostrar a saída de cada resultado no console
        

    }
    
}
