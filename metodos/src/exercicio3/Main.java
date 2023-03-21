package exercicio3;

public class Main {
    public static void main(String[] args) {
        double quadrado = Quadri.calcularArea(15);
        System.out.println("a area do quadrado é " + quadrado );

        double triangulo = Quadri.calcularArea(5, 7);
        System.out.println("a area do tringulo é " + triangulo );

        double trapezio = Quadri.calcularArea(8, 9, 3);
        System.out.println("a area do trapezio é " + trapezio );
    }
}