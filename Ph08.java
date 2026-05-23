package PedroHenrique;

import java.util.Scanner;

public class Ph08 {

    private static final String USUARIO_CORRETO = "PedroLindo";
    private static final String SENHA_CORRETA = "12345";

    public static void main(String[] args) {
        
        System.out.println(" ********************************************** ");
        System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
        System.out.println("* Classe Ph08 - LoginSimples ");
        System.out.println(" ********************************************** ");
        System.out.println(" Abaixo o restante do código ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite o nome de usuário: ");
        String usuarioDigitado = scanner.nextLine(); 
        System.out.print("Digite a senha: ");
        String senhaDigitada = scanner.nextLine();

        scanner.close();

        verificarLogin(usuarioDigitado, senhaDigitada);
    }

    public static void verificarLogin(String user, String pass) {

        System.out.println("\n--- Status do Login ---");      
        if (user.equals(USUARIO_CORRETO) && pass.equals(SENHA_CORRETA)) {           
            System.out.println("LOGIN BEM-SUCEDIDO! Bem-vindo(a), " + user + ".");
            
        } else if (!user.equals(USUARIO_CORRETO)) {       
            System.out.println("ACESSO NEGADO! Usuário incorreto. ");
        } else {
            System.out.println("ACESSO NEGADO! Senha incorreta. ");
        }
    }
}