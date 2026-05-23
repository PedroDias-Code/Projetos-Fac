package PedroHenrique;

import java.util.Scanner;

public class Ph27 {

	public static void main(String[] args) {

		System.out.println(" ********************************************** ");
		System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
		System.out.println("* Classe Ph27 - Contar Impares ");
		System.out.println(" ********************************************** ");
		System.out.println(" Abaixo o restante do código ");

		Scanner scanner = new Scanner(System.in);

		int contagemImpares = 0;

		int numerosLidos = 1;

		System.out.println("\n--- Contagem de Números Ímpares ---");
		System.out.println("Você deve digitar 10 números inteiros.");

		while (numerosLidos <= 10) {

			System.out.print("Digite o " + numerosLidos + "º número: ");
			int numero = scanner.nextInt();

			if (numero % 2 != 0) {
				contagemImpares++;
			}

			numerosLidos++;
		}

		scanner.close();

		System.out.println("\n-----------------------------");
		System.out.println("De 10 números digitados, foram encontrados " + contagemImpares + " números ÍMPARES. ");
		System.out.println("-----------------------------");
	}
}