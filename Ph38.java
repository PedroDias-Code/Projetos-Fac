package PedroHenrique;

import java.util.Scanner;

public class Ph38 {

	public static void main(String[] args) {

		System.out.println(" ********************************************** ");
		System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
		System.out.println("* Classe Ph38 - Confirmar Saida ");
		System.out.println(" ********************************************** ");
		System.out.println(" Abaixo o restante do código ");

		Scanner scanner = new Scanner(System.in);

		String resposta = "";

		System.out.println("\n--- Sistema com Menu de Confirmação ---");

		do {

			System.out.println("\nExecutando a operação principal... (Poderia ser um menu aqui)");

			System.out.print(
					"Deseja realmente sair do programa? (Digite S para Sim, ou qualquer outra tecla para Não): ");

			resposta = scanner.nextLine().toUpperCase();

			if (!resposta.equals("S")) {
				System.out.println("-> OK! Continuando a execução...");
			}

		} while (!resposta.equals("S"));

		scanner.close();

		System.out.println("\n-----------------------------");
		System.out.println("Saída confirmada. Programa encerrado. ");
		System.out.println("-----------------------------");
	}
}