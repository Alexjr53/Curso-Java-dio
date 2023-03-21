package exercicio3;

public class Quadri {
    public static double calcularArea(double lado) {
        return lado * lado; 
         
    }

    public static double calcularArea(double base, double altura) {
        return base * altura;
        
    }

    public static double calcularArea(double baseMenor, double baseMaior, double altura) {
        return (baseMenor + baseMaior) * altura / 2;
    }
}
