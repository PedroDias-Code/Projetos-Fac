package PedroHenrique;

import java.util.Scanner;

public class Ph09 {

	public static void main(String[] args) {

		System.out.println(" ********************************************** ");
		System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
		System.out.println("* Classe Ph09 - Ordem Crescente");
		System.out.println(" ********************************************** ");
		System.out.println(" Abaixo o restante do código ");

		Scanner scanner = new Scanner(System.in);

		System.out.print("\nDigite o PRIMEIRO número inteiro: ");
		int n1 = scanner.nextInt();

		System.out.print("Digite o SEGUNDO número inteiro: ");
		int n2 = scanner.nextInt();

		System.out.print("Digite o TERCEIRO número inteiro: ");
		int n3 = scanner.nextInt();

		scanner.close();

		ordenarNumeros(n1, n2, n3);
	}

	public static void ordenarNumeros(int n1, int n2, int n3) {

		System.out.println("\n--- Resultado da Ordenação ---");
		System.out.print("Números em ordem crescente: ");

		if (n1 <= n2 && n1 <= n3) {
			if (n2 <= n3) {
				System.out.println(n1 + ", " + n2 + ", " + n3);
			} else {
				System.out.println(n1 + ", " + n3 + ", " + n2);
			}
		} else if (n2 <= n1 && n2 <= n3) {
			if (n1 <= n3) {
				System.out.println(n2 + ", " + n1 + ", " + n3);
			} else {
				System.out.println(n2 + ", " + n3 + ", " + n1);
			}
		} else {
			if (n1 <= n2) {
				System.out.println(n3 + ", " + n1 + ", " + n2);
			} else {
				System.out.println(n3 + ", " + n2 + ", " + n1);
			}
		}
	}
}