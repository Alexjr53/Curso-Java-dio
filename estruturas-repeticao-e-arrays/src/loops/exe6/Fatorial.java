package loops.exe6;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite um numero: ");
        int numero = scanner.nextInt();
        int fatorial = 1;

        for (int i = numero; i >= 1; i--) {
            fatorial = fatorial * i;         
        }

        System.out.println(numero + "! = " + fatorial);
        
    }
    
}