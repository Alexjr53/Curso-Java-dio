package one.digitalinovation;

import java.util.ArrayList;
import java.util.List;




public class Main {
    public static void main(String[] args) {
        
        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("ford"));
        listCarros.add(new Carro("chevrolet"));
        listCarros.add(new Carro("fiat"));
        listCarros.add(new Carro("pegeout"));

        System.out.println(listCarros.contains(new Carro("ford")));

        System.out.println(listCarros.get(2));

        System.out.println(listCarros.indexOf(new Carro("pegeout")));

        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);


    }
}
