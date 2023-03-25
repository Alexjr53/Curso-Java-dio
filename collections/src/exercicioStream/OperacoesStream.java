package exercicioStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.print.attribute.standard.RequestingUserName;
import javax.sound.sampled.SourceDataLine;

public class OperacoesStream {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("imprima todos os elementos dessa lista de String: ");

        numerosAleatorios.forEach(System.out::println);

        System.out.println("pegue os 5 primeiro numeros e coloque dentro de um set");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);


        // System.out.println("transforme essa lista de string em uma lista de numeros inteiros: ");
        // numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList()).forEach(System.out::println);
            
        
        // List<Integer> numerosParesMaioresQue2 = numerosAleatorios.stream().map(Integer::parseInt).filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList());
        
        // System.out.println(numerosParesMaioresQue2);

        // numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

        
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());

        numerosAleatoriosInteger.removeIf(integer -> (integer % 2 != 0));  
        System.out.println(numerosAleatoriosInteger);          
    }

}
