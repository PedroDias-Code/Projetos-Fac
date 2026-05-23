package PedroHenrique;

import java.util.Scanner;

public class Ph12 {

    public static void main(String[] args) {
        System.out.println(" ********************************************** ");
        System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
        System.out.println("* Classe Ph12 -  Tabuada ");
        System.out.println(" ********************************************** ");
        System.out.println(" Abaixo o restante do código ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite o número para o qual deseja a tabuada: ");
        int numero = scanner.nextInt(); 

        scanner.close();

        gerarTabuada(numero);
    }

    public static void gerarTabuada(int num) {
        
        System.out.println("\n--- Tabuada do " + num + " ---");
        
        for (int i = 1; i <= 10; i++) {
            
            int resultado = num * i;
            
            System.out.println(num + " x " + i + " = " + resultado);
        }
        
        System.out.println("---------------------------");
    }
}