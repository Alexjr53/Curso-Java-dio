package metodoslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        

        //primeira maneira de criar uma lista
        List<Double> notas = new ArrayList<>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(3.0);
        notas.add(3.6);

        System.out.println(notas);


        //segunda maneira de criar uma lista e segunda maneira de imprimir essa lista
        List<Double> notas2 = new ArrayList<>(Arrays.asList(7.0, 8.5, 9.3, 5.0, 7.0, 0.0, 3.6));
        
        System.out.println(notas.toString());

        System.out.println("exiba a posição da nota 5.0: " + notas.indexOf(5d)); // para imprimir o indice de um valor

        System.out.println("para adicionar um valor ou elemento em uma determinada indice:");
        //para adicionar um valor ou elemento em uma determinada indice:
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("para substituir um elemento da lista por outro");
        //para substituir um elemento da lista por outro
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        System.out.println("confere se a nota 5.0 está na lista: ");
        //confere se a nota 5.0 está na lista: 
        System.out.println(notas.contains(5.0));


        System.out.println("exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("exiba a menor nota: " + Collections.min(notas));

        System.out.println("exiba a maior nota: " + Collections.max(notas));

        System.out.println("exiba a soma dos valores");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("exiba a soma dos valores: " + soma);

        System.out.println("exiba a media das notas: " + soma/notas.size());

        System.out.println("remove a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);


        System.out.println("remove as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if(next < 7) iterator.remove();
        }
        System.out.println(notas);

        System.out.println("apague toda lista: ");
        notas.clear();
        System.out.println(notas);


        System.out.println("confira se a lista está vazia: " + notas.isEmpty());

    }
    
}