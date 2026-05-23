package PedroHenrique;

import java.util.Scanner;

public class Ph07 {

	public static void main(String[] args) {

		System.out.println(" ********************************************** ");
		System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
		System.out.println("* Classe Ph07 - ValidaTriangulo ");
		System.out.println(" ********************************************** ");
		System.out.println(" Abaixo o restante do código ");

		Scanner scanner = new Scanner(System.in);

		System.out.print("\nDigite o comprimento do Lado A: ");
		double ladoA = scanner.nextDouble();
		System.out.print("Digite o comprimento do Lado B: ");
		double ladoB = scanner.nextDouble();
		System.out.print("Digite o comprimento do Lado C: ");
		double ladoC = scanner.nextDouble();

		scanner.close();

		verificarTriangulo(ladoA, ladoB, ladoC);
	}

	public static void verificarTriangulo(double a, double b, double c) {

		System.out.println("\n--- Resultado da Análise ---");

		if (a < b + c && b < a + c && c < a + b) {

			if (a == b && b == c) {
				System.out.println("Tipo: Triângulo EQUILÁTERO (Todos os lados iguais).");
			} else if (a == b || a == c || b == c) {
				System.out.println("Tipo: Triângulo ISÓSCELES (Dois lados iguais).");
			} else {
				System.out.println("Tipo: Triângulo ESCALENO (Todos os lados diferentes).");
			}

		} else {
			System.out.println("Os lados informados NÃO FORMAM um triângulo. ");
			System.out.println("Motivo: A soma de dois lados deve ser maior que o terceiro.");
		}
	}
}