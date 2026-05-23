package PedroHenrique;
import java.util.Scanner;

public class Ph01 {

	public static void main(String[] args) {
		System.out.println(" ********************************************** ");
		System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
		System.out.println("* Classe PH01 - Número poisitivo ou Negativo ");
		System.out.println(" ********************************************** ");		
		System.out.println(" Abaixo o restante do código ");
		
		Scanner pozenega = new Scanner(System.in);
		
		System.out.println("\nDigite um número: ");
		
		if (pozenega.hasNextDouble()) {
            double numero = pozenega.nextDouble();
		
		if (numero > 0) { 
		System.out.println("O número " + numero + " é positivo. ");
		} else if (numero < 0) {
		System.out.println("O número " + numero + " é negativo ");
		}else {
			System.out.println("O número é ZERO");
		}
	}else {
		System.out.println("Entrada inválida. Por favor, digite um número.");
	}
	pozenega.close();

}

}
