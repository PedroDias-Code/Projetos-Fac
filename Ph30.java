package PedroHenrique;

import java.util.Scanner;

public class Ph30 {

    public static void main(String[] args) {

        System.out.println(" ********************************************** ");
        System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
        System.out.println("* Classe Ph30 - Menu ");
        System.out.println(" ********************************************** ");
        System.out.println(" Abaixo o restante do código ");

        Scanner scanner = new Scanner(System.in);

        int opcao = 0; 
        
        System.out.println("\n--- Sistema Interativo ---");

        while (opcao != 4) {
            
            exibirMenu();
            
            System.out.print("Escolha uma opção: ");
            
            try {
                opcao = scanner.nextInt(); 
                
                processarOpcao(opcao);
                
            } catch (Exception e) {
                System.out.println(" Entrada inválida! Digite apenas o número da opção.");
                scanner.nextLine(); 
                opcao = 0; 
            }
        } 

        scanner.close();
        
        System.out.println("\n-----------------------------");
        System.out.println("Programa encerrado. Até mais! ");
        System.out.println("-----------------------------");
    }
    
    public static void exibirMenu() {
        System.out.println("\n-----------------------------");
        System.out.println("1. Novo Cadastro");
        System.out.println("2. Consultar Dados");
        System.out.println("3. Configurações");
        System.out.println("4. Sair");
        System.out.println("-----------------------------");
    }

    public static void processarOpcao(int op) {
        switch (op) {
            case 1:
                System.out.println(" Você escolheu: Novo Cadastro.");
                break;
            case 2:
                System.out.println(" Você escolheu: Consultar Dados.");
                break;
            case 3:
                System.out.println(" Você escolheu: Configurações.");
                break;
            case 4:
                break;
            default:
                System.out.println(" Opção inválida. Escolha um número entre 1 e 4.");
                break;
        }
    }
}