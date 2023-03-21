package loops.exe4;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int countMax;
        int numero;
        int numeroPar = 0;
        int numeroImpar = 0;
        System.out.println("quantos numeros pretende digitar ? ");
        countMax = scanner.nextInt();

        do {
            System.out.println("digite um numero: ");
            numero = scanner.nextInt();
            count++;
            if (numero % 2 == 0) {
                numeroPar++;
            } else {
                numeroImpar++;
            }
            
        } while (count < countMax);

        System.out.println("a quantidade de numeros pares é: " + numeroPar);
        System.out.println("a quantidade de numeros impares é: " + numeroImpar);
    }
}
