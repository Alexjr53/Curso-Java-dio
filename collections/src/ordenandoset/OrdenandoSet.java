package ordenandoset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class OrdenandoSet {
    public static void main(String[] args) {
        Set<Series> minhasSeries = new HashSet<>(){{
            add(new Series("got", "fantasia", 60));
            add(new Series("dark", "drama", 60));
            add(new Series("that '70s show", "comedia", 25));
        }};

        for (Series series :minhasSeries ) System.out.println(series.getNome() + " " + series.getGenero() + " " + series.getTempoEpisodio());


        System.out.println("para imprimir em ordem de inserção: ");
        Set<Series> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Series("got", "fantasia", 60));
            add(new Series("dark", "drama", 60));
            add(new Series("that '70s show", "comedia", 25));
        }};

        for (Series series :minhasSeries1 ) System.out.println(series.getNome() + " " + series.getGenero() + " " + series.getTempoEpisodio());


        System.out.println("para ordenar em ordem natural ");
        Set<Series> minhasSeries2 = new TreeSet<>(minhasSeries1);
        System.out.println(minhasSeries2);


        System.out.println("ordem nome, genero, tempo de episodio ");
        Set<Series> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);

        for (Series series :minhasSeries3 ) System.out.println(series.getNome() + " " + series.getGenero() + " " + series.getTempoEpisodio());
    }
}
