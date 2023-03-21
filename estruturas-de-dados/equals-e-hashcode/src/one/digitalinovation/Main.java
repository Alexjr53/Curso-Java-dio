package one.digitalinovation;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("chevrolet"));
        listaCarros.add(new Carro("volkswagen"));

        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println((new Carro("Ford").hashCode()));
        System.out.println((new Carro("Ford").hashCode()));
        
        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("chevrolet");

        System.out.println(carro1.equals(carro2));
    }
}
