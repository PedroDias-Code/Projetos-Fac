package PedroHenrique;

import java.util.Scanner;

public class Ph34 {

	private static final int SENHA_CORRETA = 1111;

	public static void main(String[] args) {

		System.out.println(" ********************************************** ");
		System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
		System.out.println("* Classe Ph34 - Senha Correta ");
		System.out.println(" ********************************************** ");
		System.out.println(" Abaixo o restante do código ");

		Scanner scanner = new Scanner(System.in);

		int senhaDigitada;

		System.out.println("\n--- Sistema de Segurança ---");
		do {

			System.out.print("Digite a senha de 4 dígitos: ");

			if (scanner.hasNextInt()) {
				senhaDigitada = scanner.nextInt();

				if (senhaDigitada != SENHA_CORRETA) {
					System.out.println(" Senha incorreta! Tente novamente.");
				}

			} else {

				System.out.println(" Entrada inválida! Digite apenas números.");
				scanner.next();
				senhaDigitada = 0;
			}

		} while (senhaDigitada != SENHA_CORRETA);

		scanner.close();

		System.out.println("\n-----------------------------");
		System.out.println("Acesso liberado! ");
		System.out.println("-----------------------------");
	}
}