package PedroHenrique;

import java.util.Scanner;

public class Ph33 {

	public static void main(String[] args) {

		System.out.println(" ********************************************** ");
		System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
		System.out.println("* Classe Ph33 - Menu ");
		System.out.println(" ********************************************** ");
		System.out.println(" Abaixo o restante do código ");

		Scanner scanner = new Scanner(System.in);

		int opcao;

		System.out.println("\n--- Menu Interativo ---");

		do {

			exibirMenu();

			System.out.print("Escolha uma opção (1 ou 2): ");

			if (scanner.hasNextInt()) {
				opcao = scanner.nextInt();

				processarOpcao(opcao);

			} else {
				System.out.println(" Entrada inválida! Digite apenas o número da opção (1 ou 2).");
				scanner.next();
				opcao = 0;
			}

		} while (opcao != 2);

		scanner.close();

		System.out.println("\n-----------------------------");
		System.out.println("Programa encerrado! ");
		System.out.println("-----------------------------");
	}

	public static void exibirMenu() {
		System.out.println("\n-----------------------------");
		System.out.println("1 - Mensagem");
		System.out.println("2 - Sair");
		System.out.println("-----------------------------");
	}

	public static void processarOpcao(int op) {
		switch (op) {
		case 1:
			System.out.println(" Você é especial a Jesus!! ");
			break;
		case 2:
			break;
		default:
			System.out.println(" Opção inválida. Escolha 1 ou 2.");
			break;
		}
	}
}