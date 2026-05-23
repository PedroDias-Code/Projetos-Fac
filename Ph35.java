package PedroHenrique;

import java.util.Scanner;

public class Ph35 {

	public static void main(String[] args) {

		System.out.println(" ********************************************** ");
		System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
		System.out.println("* Classe Ph35 - Numero Positivo Obrigatorio");
		System.out.println(" ********************************************** ");
		System.out.println(" Abaixo o restante do código ");

		Scanner scanner = new Scanner(System.in);

		int numero;

		System.out.println("\n--- Entrada de Dados Obrigatória ---");

		do {

			System.out.print("Digite um número inteiro POSITIVO (maior que zero): ");

			if (scanner.hasNextInt()) {
				numero = scanner.nextInt();

				if (numero <= 0) {
					System.out.println(" Entrada inválida! O número deve ser maior que zero.");
				}

			} else {
				System.out.println(" Entrada inválida! Por favor, digite apenas números.");
				scanner.next();
				numero = 0;
			}
		} while (numero <= 0);

		scanner.close();

		System.out.println("\n-----------------------------");
		System.out.println("Obrigado! Número positivo recebido: " + numero + "");
		System.out.println("-----------------------------");
	}
}