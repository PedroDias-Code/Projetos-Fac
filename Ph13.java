package PedroHenrique;

public class Ph13 {

    public static void main(String[] args) {
        
        System.out.println(" ********************************************** ");
        System.out.println("*Aluno: Pedro Henrique Dias de Moura - 0025842");
        System.out.println("* Classe Ph13 - Soma de 1 a 100 ");
        System.out.println(" ********************************************** ");
        System.out.println(" Abaixo o restante do código ");

        System.out.println("\nCalculando a soma dos números de 1 até 100...");
       
        int somaTotal = 0;
        
        for (int i = 1; i <= 100; i++) {
            
            somaTotal = somaTotal + i;

        }
        
        System.out.println("\n--- Resultado ---");
        System.out.println("A soma dos 100 primeiros números naturais (1 a 100) é: " + somaTotal + "");
        System.out.println("-----------------");
        
    }
}