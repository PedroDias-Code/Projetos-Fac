package PedroHenrique;

import java.util.Scanner;

public class Ph20 {

    public static void main(String[] args) {
 
        System.out.println(" ********************************************** ");
        System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
        System.out.println("* Classe Ph20 - Fibonacci ");
        System.out.println(" ********************************************** ");
        System.out.println(" Abaixo o restante do código ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nQuantos termos da sequência de Fibonacci você deseja ver? (N): ");
        int n = scanner.nextInt(); 

        scanner.close();

        gerarFibonacci(n);
    }

    public static void gerarFibonacci(int n) {

        if (n <= 0) {
            System.out.println("\nO número de termos deve ser positivo.");
            return;
        }
        
        System.out.println("\n--- Sequência de Fibonacci (" + n + " termos) ---");

        long termoAnterior = 0; 
        long termoAtual = 1;  
        
   
        if (n == 1) {
            System.out.print(termoAnterior); 
        } 
  
        else {
            System.out.print(termoAnterior + ", " + termoAtual);

            for (int i = 3; i <= n; i++) {

                long proximoTermo = termoAnterior + termoAtual;
 
                System.out.print(", " + proximoTermo);
                
                termoAnterior = termoAtual;
                termoAtual = proximoTermo;
            }
        }
        
        System.out.println("\n-------------------------------------------");
    }
}