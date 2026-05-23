package PedroHenrique;

import java.util.Scanner;

public class Ph40 {

	public static void main(String[] args) {

		System.out.println(" ********************************************** ");
		System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
		System.out.println("* Classe Ph40 - Maior Numero Positivo ");
		System.out.println(" ********************************************** ");
		System.out.println(" Abaixo o restante do código ");

		Scanner scanner = new Scanner(System.in);

		int numeroLido;

		int maiorNumero = Integer.MIN_VALUE;

		System.out.println("\n--- Encontrar o Maior Número ---");
		System.out.println("Digite números positivos. Digite um número NEGATIVO para encerrar.");

		do {

			System.out.print("Digite um número: ");

			if (scanner.hasNextInt()) {
				numeroLido = scanner.nextInt();

				if (numeroLido > 0) {

					if (numeroLido > maiorNumero) {
						maiorNumero = numeroLido;
					}
				}

			} else {

				System.out.println(" Entrada inválida! Digite apenas números.");
				scanner.next();
				numeroLido = -1;
			}

		} while (numeroLido >= 0);

		scanner.close();

		System.out.println("\n-----------------------------");

		if (maiorNumero == Integer.MIN_VALUE) {
			System.out.println("Nenhum número positivo foi digitado para comparação. ");
		} else {
			System.out.println("O MAIOR número positivo digitado foi: " + maiorNumero + "");
		}
		System.out.println("-----------------------------");
	}
}