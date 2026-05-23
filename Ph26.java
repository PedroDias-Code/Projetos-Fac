package PedroHenrique;

import java.util.Scanner;

public class Ph26 {

	public static void main(String[] args) {

		System.out.println(" ********************************************** ");
		System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
		System.out.println("* Classe Ph26 - Numero Primo");
		System.out.println(" ********************************************** ");
		System.out.println(" Abaixo o restante do código ");

		Scanner scanner = new Scanner(System.in);

		System.out.print("\nDigite um número inteiro: ");
		int numero = scanner.nextInt();

		scanner.close();

		verificarPrimoWhile(numero);
	}

	public static void verificarPrimoWhile(int num) {
        
        System.out.println("\n--- Verificação de Número Primo ---");

        if (num <= 1) {
            System.out.println("O número " + num + " não é primo. (Primos devem ser maiores que 1)");
            return;
        }

        int divisor = 2;

        boolean encontrouDivisor = false;

        while (divisor < num && !encontrouDivisor) {

            if (num % divisor == 0) {
                encontrouDivisor = true;
            }

            divisor++; 
        }

        if (encontrouDivisor) {
            System.out.println("O número " + num + " NÃO é primo.");
        } else {
            System.out.println("O número " + num + " é PRIMO!5");
        }
    }
}