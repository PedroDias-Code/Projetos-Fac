package PedroHenrique;

import java.util.Scanner;

public class Ph29 {

	public static void main(String[] args) {

		System.out.println(" ********************************************** ");
		System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
		System.out.println("* Classe Ph29 - Contar De Digitos ");
		System.out.println(" ********************************************** ");
		System.out.println(" Abaixo o restante do código ");

		Scanner scanner = new Scanner(System.in);

		System.out.print("\nDigite um número inteiro positivo: ");
		int numeroOriginal = scanner.nextInt();

		scanner.close();

		contarDigitos(numeroOriginal);
	}

	public static void contarDigitos(int num) {

		System.out.println("\n--- Contagem de Dígitos ---");

		if (num == 0) {
			System.out.println("O número 0 tem 1 dígito.");
			return;
		}

		int numeroTrabalho = Math.abs(num);

		int contador = 0;

		while (numeroTrabalho > 0) {

			numeroTrabalho = numeroTrabalho / 10;

			contador++;
		}

		System.out.println("O número " + num + " tem " + contador + " dígitos.");
		System.out.println("---------------------------");
	}
}