package PedroHenrique;

import java.util.Scanner;

public class Ph37 {

    public static void main(String[] args) {

        System.out.println(" ********************************************** ");
        System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
        System.out.println("* Classe Ph37 - Soma ate ser multiplo de 10 ");
        System.out.println(" ********************************************** ");
        System.out.println(" Abaixo o restante do código ");

        Scanner scanner = new Scanner(System.in);

        int somaTotal = 0;

        int numeroLido; 
        
        System.out.println("\n--- Soma de Números (Parada no Múltiplo de 10) ---");
        System.out.println("A soma será exibida quando você digitar um número múltiplo de 10 (ex: 10, 20, 30...).");
 
        do {
            
            System.out.print("Digite um número: ");

            if (scanner.hasNextInt()) {
                numeroLido = scanner.nextInt(); 

                somaTotal += numeroLido; 
                
            } else {

                System.out.println("  Entrada inválida! Por favor, digite apenas números.");
                scanner.next(); 
                numeroLido = 0;  
            }

        } while (numeroLido % 10 != 0); 

        scanner.close();

        System.out.println("\n-----------------------------");
        System.out.println("Número múltiplo de 10 detectado. Fim do loop.");
        System.out.println("Soma total dos números (incluindo o múltiplo de 10): " + somaTotal + "");
        System.out.println("-----------------------------");
    }
}