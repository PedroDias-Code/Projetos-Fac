package PedroHenrique;

import java.util.Scanner;

public class Ph06 {

	public static void main(String[] args) {

		System.out.println(" ********************************************** ");
		System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
		System.out.println("* Classe Ph06 - Multiplos de 3 e 5 Divisibilidade ");
		System.out.println(" ********************************************** ");
		System.out.println(" Abaixo o restante do código ");

		Scanner multc = new Scanner(System.in);

		System.out.print("\nDigite um número inteiro: ");
		int numero = multc.nextInt();

		multc.close();

		verificarMultiplo(numero);
	}

	public static void verificarMultiplo(int num) {

		System.out.println("\n--- Resultado da Verificação ---");

		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("O número " + num + " é MÚLTIPLO de 3 E de 5 (ou seja, múltiplo de 15). ");
		} else if (num % 3 == 0) {
			System.out.println("O número " + num + " é MÚLTIPLO de 3, mas não de 5.");
		} else if (num % 5 == 0) {
			System.out.println("O número " + num + " é MÚLTIPLO de 5, mas não de 3.");
		} else {
			System.out.println("O número " + num + " não é múltiplo nem de 3, nem de 5. ");
		}
	}
}