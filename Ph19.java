package PedroHenrique;

import java.util.Scanner;

public class Ph19 {

    public static void main(String[] args) {
     
        System.out.println(" ********************************************** ");
        System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
        System.out.println("* Classe Ph19 - Numero Primo ");
        System.out.println(" ********************************************** ");
        System.out.println(" Abaixo o restante do código ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite um número inteiro: ");
        int numero = scanner.nextInt(); 

        scanner.close();

        verificarPrimo(numero);
    }

    public static void verificarPrimo(int num) {
        
        System.out.println("\n--- Verificação de Número Primo ---");
        
        if (num <= 1) {
            System.out.println("O número " + num + " não é primo. (Primos devem ser maiores que 1)");
            return;
        }

        int contadorDivisores = 0;

        for (int i = 2; i < num; i++) {
            
            if (num % i == 0) {
                contadorDivisores++;
                break; 
            }
        }

        if (contadorDivisores == 0) {
            System.out.println("O número " + num + " é PRIMO! ");
        } else {
            System.out.println("O número " + num + " NÃO é primo.");
        }
    }
}