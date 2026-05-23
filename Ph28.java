package PedroHenrique;

public class Ph28 {

	public static void main(String[] args) {

		System.out.println(" ********************************************** ");
		System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
		System.out.println("* Classe Ph28 - Soma Pares ");
		System.out.println(" ********************************************** ");
		System.out.println(" Abaixo o restante do código ");

		System.out.println("\nCalculando a soma dos números pares de 1 até 100...");

		int somaTotal = 0;

		int contador = 2;

		while (contador <= 100) {

			somaTotal += contador;

			contador += 2;
		}

		System.out.println("\n-----------------------------");
		System.out.println("A soma de todos os números pares entre 1 e 100 é: " + somaTotal + "");
		System.out.println("-----------------------------");

	}
}