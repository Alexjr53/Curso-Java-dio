package loops.exe2;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int nota;

        System.out.println("digite uma nota de 0 a 10: ");
        nota = scanner.nextInt();

        while ( nota < 0 || nota > 10) {
            System.out.println("numero invalido, digite novamente: ");
            nota = scanner.nextInt();
        };

    }
}
