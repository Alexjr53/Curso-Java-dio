package exercicioslist.exerciciotemperatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedidorDeTemperatura {
    public static void main(String[] args) {
        double media = 0;
        List<Double> temperaturaMensal = new ArrayList<>();
        String[] nomeMeses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho"};
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 6; i++) {
            System.out.print("Digite a temperatura média do mês " + i + ": ");
            double temperatura = scanner.nextDouble();
            temperaturaMensal.add(temperatura);
        }

        for (int i = 0; i < temperaturaMensal.size(); i++) {
            media += temperaturaMensal.get(i);
        }
        media /= temperaturaMensal.size();

        for (int i = 0; i < temperaturaMensal.size(); i++) {
            if (temperaturaMensal.get(i) > media) {
                System.out.println((i+1) + " " + nomeMeses[i] + " " + temperaturaMensal.get(i)); 
            }
        }
        System.out.println("lista completa das temperaturas mensais: " + temperaturaMensal);
    }
}
