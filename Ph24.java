package PedroHenrique;

import java.util.Scanner;

public class Ph24 {

	public static void main(String[] args) {

		System.out.println(" ********************************************** ");
		System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
		System.out.println("* Classe Ph24 - Numero Positivo ");
		System.out.println(" ********************************************** ");
		System.out.println(" Abaixo o restante do código ");

		Scanner scanner = new Scanner(System.in);

		int numero = 0;

		System.out.println("\n--- Verificação de Número Positivo ---");

		while (numero <= 0) {

			if (numero <= 0 && numero != 0) {
				System.out.println(" Número inválido! Por favor, digite um valor maior que zero.");
			}

			System.out.print("Digite um número inteiro POSITIVO: ");
			numero = scanner.nextInt();
		}
		scanner.close();

		System.out.println("\n-----------------------------");
		System.out.println("Obrigado! O número digitado (" + numero + ") é POSITIVO. ");
		System.out.println("-----------------------------");
	}
}