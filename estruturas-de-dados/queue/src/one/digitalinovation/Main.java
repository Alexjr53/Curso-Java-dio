package one.digitalinovation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        
        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("ford"));
        queueCarros.add(new Carro("chevrolet"));
        queueCarros.add(new Carro("fiat"));
        
        System.out.println(queueCarros.add(new Carro("pegeout")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new Carro("renault")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());


    }
}
