package PedroHenrique;

import java.util.Scanner;

public class Ph23 {

	private static final String SENHA_DEFINIDA = "Pedrogatao";

	public static void main(String[] args) {

		System.out.println(" ********************************************** ");
		System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
		System.out.println("* Classe Ph23 - Senha Correta ");
		System.out.println(" ********************************************** ");
		System.out.println(" Abaixo o restante do código ");

		Scanner scanner = new Scanner(System.in);

		String senhaDigitada = "";

		System.out.println("\n--- Sistema de Login ---");

		while (!senhaDigitada.equals(SENHA_DEFINIDA)) {

			if (!senhaDigitada.isEmpty()) {
				System.out.println("\n Senha incorreta! Tente novamente.");
			}

			System.out.print("Digite a senha de acesso: ");

			senhaDigitada = scanner.nextLine();
		}

		scanner.close();

		System.out.println("\n-----------------------------");
		System.out.println("ACESSO PERMITIDO! Senha correta. Bem-vindo(a) ");
		System.out.println("-----------------------------");
	}
}