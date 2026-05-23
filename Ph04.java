package PedroHenrique;

import java.util.Scanner;

public class Ph04 {

	public static void main(String[] args) {
		System.out.println(" ********************************************** ");
		System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
		System.out.println("* Classe Ph04 - Voto - Verificação de Idade ");
		System.out.println(" ********************************************** ");
		System.out.println(" Abaixo o restante do código ");

		Scanner voto = new Scanner(System.in);

		System.out.println("\nDigite sua idade");
		int idade = voto.nextInt();
		voto.close();

		podeounaoVOTAR(idade);
	}

	private static void podeounaoVOTAR(int idade) {

		System.out.println("\n--- Situação de voto ---");

		if (idade < 16) {
			System.out.println("Idade: " + idade + " anos.");
            System.out.println("Situação: VOCÊ NÃO PODE VOTAR.");
            System.out.println("Motivo: Idade mínima de 16 anos não atingida.");
		}else if (idade >= 18 && idade < 70) {
            System.out.println("Idade: " + idade + " anos.");
            System.out.println("Situação: VOTO OBRIGATÓRIO.");
            System.out.println("Motivo: Você está na faixa de obrigatoriedade do voto.");
		}else if ((idade >= 16 && idade < 18) || idade >= 70) {
			System.out.println("Idade: " + idade + " anos.");
			System.out.println("Situação: VOTO FACULTATIVO.");
			System.out.println("Motivo: O voto é opcional para a sua faixa etária.");
		} else {
			System.out.println("ERRO: Idade inválida, pois você ainda é de menor");
		}

	}

}
