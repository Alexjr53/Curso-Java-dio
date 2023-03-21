package loops.exe3;

import java.util.Scanner;

public class MaiorNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int numeroMaior = 0;
        double media = 0;
        int count = 0;

        do {
            System.out.println("digite o primeiro numero: ");
            numero = scanner.nextInt();
            
            media = media + numero; 
            if (numero > numeroMaior) {
                numeroMaior = numero;
            }
            count++;    
        } while (count < 5);
        System.out.println("O maior numero é: " + numeroMaior);
        

        System.out.println("a media é " + (media = media / 5));
    }
}
