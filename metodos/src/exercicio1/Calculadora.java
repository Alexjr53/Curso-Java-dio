package exercicio1;

public class Calculadora {
    
    public static void somar(double valor1, double valor2) {
        double resultado = valor1 + valor2;

        System.out.println("o resultado da soma de " + valor1 + " + " + valor2 + " é: " + resultado);
    }


    public static void subtrair(double valor1, double valor2) {
        double resultado = valor1 - valor2;

        System.out.println("o resultado da subtração de " + valor1 + " - " + valor2 + " é: " + resultado);
    }

    public static void multiplicar(double valor1, double valor2) {
        double resultado = valor1 * valor2;

        System.out.println("o resultado da multiplicação de " + valor1 + " X " + valor2 + " é: " + resultado);
    }

    public static void dividir(double valor1, double valor2) {
        double resultado = valor1 / valor2;

        System.out.println("o resultado da divisão de " + valor1 + " / " + valor2 + " é: " + resultado);
    

    }
}
