package PedroHenrique;

import java.util.Scanner;

public class Ph15 {

	public static void main(String[] args) {
		System.out.println(" ********************************************** ");
		System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
		System.out.println("* Classe Ph15 - Fatorial  ");
		System.out.println(" ********************************************** ");
		System.out.println(" Abaixo o restante do código ");

		Scanner scanner = new Scanner(System.in);

		System.out.print("\nDigite um número inteiro positivo para calcular o fatorial: ");

		int numero = scanner.nextInt();

		scanner.close();

		calcularFatorial(numero);
	}

	public static void calcularFatorial(int num) {

		System.out.println("\n--- Resultado do Fatorial ---");

		if (num == 0) {
			System.out.println("0! = 1");
			return;
		}
		if (num < 0) {
			System.out.println("Não é possível calcular o fatorial de um número negativo.");
			return;
		}

		long resultadoFatorial = 1;

		System.out.print(num + "! = ");
		for (int i = num; i >= 1; i--) {

			resultadoFatorial *= i;
			System.out.print(i);
			if (i > 1) {
				System.out.print(" x ");
			}
		}

		System.out.println(" = " + resultadoFatorial + " ");
		System.out.println("-----------------------------");
	}
}