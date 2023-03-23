package exercicioset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArcoIris {
    public static void main(String[] args) {
       int quantidadeCores = 0;
        Set<Cores> listaDeCores = new TreeSet<>(){{
            add(new Cores("vermelha"));
            add(new Cores("laranja"));
            add(new Cores("amarela"));
            add(new Cores("verde"));
            add(new Cores("azul"));
            add(new Cores("azul-escuro"));
            add(new Cores("violeta"));
        }};

        Set<Cores> coresComV = new TreeSet<>();

        for (Cores cor : listaDeCores) {
            if (cor.getCores().contains("v") || cor.getCores().contains("V")) {
                coresComV.add(cor);
            }
            if (cor.getCores().contains("v") || cor.getCores().contains("V")) {
                listaDeCores.remove(cor);
            }
            
            quantidadeCores++;
        }

        System.out.println(coresComV);

        System.out.println("o arco iris tem " + quantidadeCores + " cores");
    }
}
