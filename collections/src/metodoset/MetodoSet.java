package metodoset;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MetodoSet {
    public static void main(String[] args) {

        // Set notas = new HashSet<>(); antes do java 5
        // HashSet<Double> notas = new HashSet<>();
        // Set<Double> notas = new HashSet<>();
        // Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);

        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);


        System.out.println("exiba se a nota 5.0 está no conjunto: " + notas.contains(5d));

        System.out.println("exiba a menor nota: " + Collections.min(notas)); 

        System.out.println("exiba a menor nota: " + Collections.max(notas)); 

        System.out.println("exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("exiba a meida dos valores: " + (soma/notas.size()));


        notas.remove(0d);
        System.out.println(notas);

        System.out.println("remova os valores menores que 7 e exiba a lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if(next < 7) iterator2.remove();
        }
        System.out.println(notas);

        System.out.println("exiba todos os valores na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas2);


        System.out.println("exiba todos os valores na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);


        notas.clear();
        System.out.println("confirir se a notas foi excluida" + notas);


        System.out.println("confira se o conjunto está vazio " + notas.isEmpty());
    }
    
}