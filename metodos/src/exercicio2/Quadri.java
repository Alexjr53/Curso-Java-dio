package exercicio2;

public class Quadri {
    public static void calcularArea(double lado) {
        double area = lado * lado; 
        System.out.println("a area do quadrado é " + area);    
    }

    public static void calcularArea(double base, double altura) {
        double area = base * altura;
        System.out.println("a area do tringulo é " + area);
    }

    public static void calcularArea(double baseMenor, double baseMaior, double altura) {
        double area = (baseMenor + baseMaior) * altura / 2;
        System.out.println("a area do trapézio é " + area);
    }
}
