package metodomap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.sound.sampled.SourceDataLine;

public class MetodoMap {
    public static void main(String[] args) {
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares);

        System.out.println("substitua o consumo do gol por 15,2");
        carrosPopulares.put("gol", 15.2);

        System.out.println("confira se o modelo tucson está no dicionario: " + carrosPopulares.containsKey("tucson"));

        System.out.println("exiba o consumo do uno: " + carrosPopulares.get("uno") );

        // System.out.println("exiba o terceiro modelo adicionado: ");

        System.out.println("exiba os modelos: " + carrosPopulares.keySet());

        System.out.println("exiba o consumos dos carros: " + carrosPopulares.values());

        System.out.println("exiba o modelo mais econômico e seu consumo: ");
        System.out.println(Collections.max(carrosPopulares.values()));


        System.out.println("exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("modelos mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("exiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente  = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for(Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }


        System.out.println("exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator(); 
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }

        System.out.println("a soma dos consumos é: " + soma);


        System.out.println("a média dos consumos é: " + (soma/carrosPopulares.size()));


        System.out.println("remova os consumos igual a 15,6");
        Iterator<Double> iterator2 = carrosPopulares.values().iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next().equals(15.6)) {
                iterator2.remove();
            }
        }
        System.out.println(carrosPopulares);

        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};       
        
        System.out.println("exiba o conjunto ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());


        System.out.println("apague o conjunto de carros: ");
        carrosPopulares.clear();

        System.out.println("verifica se o conjunto está vazio: " + carrosPopulares.isEmpty());
        
    }

}
