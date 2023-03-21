package exercicioslist.exerciciointerrogatorio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class interrogatorio {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        List<String> perguntasInterrogatorio = new ArrayList<>(Arrays.asList("telefonou para vitima? ", "Esteve no local do crime? ", "Mora perto da vitima? ", "Devia para a vitima? ", "já trabalhou para a vitima? "));

        List<String> respostasInterrogatorio = new ArrayList<>();
        int respostaPositiva = 0;
        
        for (int i = 0; i < perguntasInterrogatorio.size(); i++) {
            System.out.println(perguntasInterrogatorio.get(i));
            String respostaInterrogatorio = scanner.next();
            respostasInterrogatorio.add(respostaInterrogatorio);
            if (respostaInterrogatorio.equalsIgnoreCase("s")) {
                respostaPositiva++;
            }
        }

        if (respostaPositiva > 0 && respostaPositiva <= 2 ) {
            System.out.println("essa pessoa é suspeita");
        } else if (respostaPositiva >= 3 && respostaPositiva <= 4) {
            System.out.println("essa pessoa é cúmplice");
        }else if(respostaPositiva >=5){
            System.out.println("essa pessoa é o assassino");
        }else{
            System.out.println("essa pessoa não esta envoldida");
        }
        //no lugar desse ultimo if seria melhor o switch

    }
}
