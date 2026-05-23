package PedroHenrique;

import java.util.Scanner;

public class Ph10{

    public static void main(String[] args) {
        
        System.out.println(" ********************************************** ");
        System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
        System.out.println("* Classe Ph10 - AnoBissexto ");
        System.out.println(" ********************************************** ");
        System.out.println(" Abaixo o restante do código ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite o ano (ex: 2024): ");
        int ano = scanner.nextInt(); 

        scanner.close();

        verificarBissexto(ano);
    }

 
    public static void verificarBissexto(int ano) {

        System.out.println("\n--- Resultado da Verificação ---");
        
        boolean Bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        
        if (Bissexto) {
            System.out.println("O ano " + ano + " é BISSEXTO! ");
        } else {
            System.out.println("O ano " + ano + " NÃO é bissexto.");
        }
    }
}