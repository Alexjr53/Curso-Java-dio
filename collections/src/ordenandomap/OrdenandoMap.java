package ordenandomap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class OrdenandoMap {
    public static void main(String[] args) {
        
        Map<String, Livro> livrosFavoritos = new HashMap<>(){{

            put("Hawking, Stephen", new Livro("uma breve história do tempo", 256));   
            put("Duhigg, Charles", new Livro("o poder do hábito", 408));    
            put("Harari, Yuaval noah", new Livro("Lições para o século 21",432));

        }};
        
        for (Map.Entry<String, Livro> livro : livrosFavoritos.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        
        Map<String, Livro> livrosFavoritos1 = new LinkedHashMap<>(){{

            put("Hawking, Stephen", new Livro("uma breve história do tempo", 256));   
            put("Duhigg, Charles", new Livro("o poder do hábito", 408));    
            put("Harari, Yuaval noah", new Livro("Lições para o século 21",432));

        }};
        System.out.println(livrosFavoritos1);


        Map<String, Livro> livrosFavoritos2 = new TreeMap<>(livrosFavoritos1);
        for (Map.Entry<String, Livro> livro : livrosFavoritos2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        Set<Map.Entry<String, Livro>> livrosFavoritos3 = new TreeSet<>(new ComparatorNome());
        livrosFavoritos3.addAll(livrosFavoritos.entrySet());
        for (Map.Entry<String, Livro> livro : livrosFavoritos3) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println(livrosFavoritos3);
    }
}
