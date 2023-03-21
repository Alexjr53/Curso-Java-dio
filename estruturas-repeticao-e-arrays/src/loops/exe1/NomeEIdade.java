package loops.exe1;

import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade = 0;
        

        while (true) {
            
            System.out.println("DIGITE SEU NOME: ");
            nome = scanner.next();
            if (nome.equals("0")) {
                break;
            }

            System.out.println("DIGITE SUA IDADE: ");
            idade = scanner.nextInt();
            
        }

        System.out.println("Voce digitou Zero para cancelar" + idade);
        
    }

}