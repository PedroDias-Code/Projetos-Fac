package PedroHenrique;

import java.util.Scanner;

public class Ph39 {

	public static void main(String[] args) {

		System.out.println(" ********************************************** ");
		System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
		System.out.println("* Classe Ph39 - Validar Numero");
		System.out.println(" ********************************************** ");
		System.out.println(" Abaixo o restante do código ");

		Scanner scanner = new Scanner(System.in);

		int numero;

		System.out.println("\n--- Validação de Intervalo ---");

		do {

			System.out.print("Digite um número inteiro entre 1 e 5: ");

			if (scanner.hasNextInt()) {
				numero = scanner.nextInt();

				if (numero < 1 || numero > 5) {
					System.out.println(" Número fora do intervalo. Tente novamente.");
				}

			} else {

				System.out.println("⚠️ Entrada inválida! Digite apenas números.");
				scanner.next();
				numero = 0;
			}

		} while (numero < 1 || numero > 5);

		scanner.close();

		System.out.println("\n-----------------------------");
		System.out.println("Obrigado! Número válido recebido: " + numero + "");
		System.out.println("-----------------------------");
	}
}