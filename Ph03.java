package PedroHenrique;

import java.util.Scanner;

public class Ph03 {

	public static void main(String[] args) {

		System.out.println(" ********************************************** ");
		System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
		System.out.println("* Classe Ph03 - Maior de Dois Números ");
		System.out.println(" ********************************************** ");
		System.out.println(" Abaixo o restante do código ");
		
		Scanner maioumenor = new Scanner(System.in);
		System.out.println("\nDigite o PRIMERIO númnero: ");
		int num1 = maioumenor.nextInt();
		System.out.println("\nDigite o SEGUNDO número: ");

		int num2 = maioumenor.nextInt();

		maioumenor.close();

		encontrarOMaior(num1, num2);
	}

	public static void encontrarOMaior(int a, int b) {

		System.out.println("\n--- Resultado ---");

		if (a > b) {
			System.out.println("O maior número é: " + a);
		} else if (b > a) {
			System.out.println("O maior número é: " + b);
		} else {
			System.out.println("Os dois números (" + a + " e " + b + ") são IGUAIS.");
		}

	}
}
