package PedroHenrique;

import java.util.Scanner;

public class Ph05 {

	public static void main(String[] args) {
		System.out.println(" ********************************************** ");
		System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
		System.out.println("* Classe Ph05 - Notas e aprovação - Cálculo de Média ");
		System.out.println(" ********************************************** ");
		System.out.println(" Abaixo o restante do código ");

		Scanner notas = new Scanner(System.in);

		System.out.println("\nDigite a primeiar nota: ");
		double n1 = notas.nextDouble();
		System.out.println("\nDigite a segunda notas: ");
		double n2 = notas.nextDouble();
		System.out.println("\nDigite a terceira nota: ");
		double n3 = notas.nextDouble();

		notas.close();

		double media = calcularmedia(n1, n2, n3);

		verificarSituação(media);

	}

	private static double calcularmedia(double n1, double n2, double n3) {
		return (n1 + n2 + n3) / 3.0;

	}

	private static void verificarSituação(double media) {
		System.out.println("\n--- Resultado final ---");

		if (media >= 7.0) {
			System.out.println(" Aluno aprovadooo!!! ");
		} else if (media >= 5.0) {
			System.out.println("Aluno de recuperação ");
		} else {
			System.out.println("Aluno reprovado :( ");
		}

	}

}
