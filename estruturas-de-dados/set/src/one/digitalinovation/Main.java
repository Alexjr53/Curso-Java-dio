package one.digitalinovation;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        
        Set<Carro> hashSetCarros = new HashSet<>();
        
        hashSetCarros.add(new Carro("ford"));
        hashSetCarros.add(new Carro("chevrolet"));
        hashSetCarros.add(new Carro("fiat"));
        hashSetCarros.add(new Carro("pegeout"));
        hashSetCarros.add(new Carro("zip"));
        hashSetCarros.add(new Carro("alpha romeo"));

        System.out.println(hashSetCarros);


        Set<Carro> treeSetCarros = new TreeSet<>();

        hashSetCarros.add(new Carro("ford"));
        hashSetCarros.add(new Carro("chevrolet"));
        hashSetCarros.add(new Carro("fiat"));
        hashSetCarros.add(new Carro("pegeout"));
        hashSetCarros.add(new Carro("zip"));
        hashSetCarros.add(new Carro("alpha romeo"));

        System.out.println(hashSetCarros);
    }
}
