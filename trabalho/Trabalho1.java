
package trabalho;

/**
 * Disciplina: Projeto Integrador II-B 
 * @author Alexsandro Barbosa da Silva
 * professora: Lorena Piza Arndt
 * Tema: Algoritimo em Java" Média de um aluno"
 */

import java.util.Scanner;

public class Trabalho1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     double nota1, nota2, nota3;
     
     System.out.println("Entre com a primeira nota:");
     nota1 = in.nextDouble();
     
     System.out.println("Entre com a segunda nota:");
     nota2= in.nextDouble();
     
     System.out.println("Entre com a terceira nota:");
     nota3= in.nextDouble();
     
     double soma = (nota1+nota2+nota3);
     System.out.println("Nota Aluno:" +soma);
     
     if (soma >= 18){
     System.out.println("Aluno Aprovado");}
     
     else if (soma  >=15){
         System.out.println("Recuperação");}
     
     else if (soma < 15){
      System.out.println("Aluno Reprovado");}
    }
    
}

