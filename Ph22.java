package PedroHenrique;

import java.util.Scanner;

public class Ph22 {

	public static void main(String[] args) {

		System.out.println(" ********************************************** ");
		System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
		System.out.println("* Classe Ph22 - Soma ate Zero  ");
		System.out.println(" ********************************************** ");
		System.out.println(" Abaixo o restante do código ");

		Scanner scanner = new Scanner(System.in);

		int somaTotal = 0;

		int numeroLido;

		System.out.println("\n--- Soma de Números ---");
		System.out.println("Digite números inteiros. Digite 0 para encerrar e ver a soma.");

		System.out.print("Digite um número: ");
		numeroLido = scanner.nextInt();

		while (numeroLido != 0) {

			somaTotal += numeroLido;

			System.out.print("Digite um número: ");
			numeroLido = scanner.nextInt();
		}

		scanner.close();

		System.out.println("\n-----------------------------");
		System.out.println("Soma total dos números digitados: " + somaTotal + "");
		System.out.println("-----------------------------");
	}
}