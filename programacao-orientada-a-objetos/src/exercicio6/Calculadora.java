package exercicio6;

public class Calculadora implements OperaçãoMatematica{

    @Override
    public void soma(double operando1, double operando2) {
        System.out.println("Soma> " + operando1 + operando2);
    }

    @Override
    public void subtrair(double operando1, double operando2) {
        System.out.println("subtrair: " + (operando1 - operando2));
    }

    @Override
    public void multiplicar(double operando1, double operando2) {
        System.out.println("multiplicação: " + operando1 * operando2);
    }

    @Override
    public void dividir(double operando1, double operando2) {
        System.out.println("divisão: " + (operando1 / operando2));
    }
    
}
