package PedroHenrique;

import java.util.Scanner;

public class Ph02 {

	public static void main(String[] args) {
		System.out.println(" ********************************************** ");
		System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
		System.out.println("* Classe Ph02 - Número poisitivo ou Negativo ");
		System.out.println(" ********************************************** ");
		System.out.println(" Abaixo o restante do código ");

	Scanner imoupar = new Scanner(System.in);
		
	System.out.println("Digite um número: ");
	
	int numero = imoupar.nextInt();
	  
	imoupar.close();
	
	verificarParouImpar(numero);
	
		
	}

	private static void verificarParouImpar(int numero) {
		if (numero % 2==0 ) {
		System.out.println("O número " + numero + " é PAR");
		}else 
		System.out.println("O número " + numero + " é IMPAR");
	
		
	}
}
