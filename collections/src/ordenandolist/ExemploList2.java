package ordenandolist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList2 {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("jon", 18, "preto"));
            add(new Gato("simba", 6, "tigrado"));
            add(new Gato("jon", 12, "amarelo"));
        }};
        System.out.println(meusGatos);


        Collections.shuffle(meusGatos);
        System.out.println("ordem aleatoria " + meusGatos);


        Collections.sort(meusGatos);
        System.out.println("para organizar em ordem natural " + meusGatos);


        Collections.sort(meusGatos, new ComparatorIdade());
        //meusGatos.sort(new ComparetorIdade());
        System.out.println("ordenar por idade: " + meusGatos);


        // Collections.sort(meusGatos, new ComparatorCor());
        meusGatos.sort(new ComparatorCor());
        System.out.println("ordenar por cor: " + meusGatos);



        // Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println("ordenar por cor, idade e nome: " + meusGatos);
    }


}
