package arrays.exe2;

import java.util.Scanner;

public class consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantConsoantes = 0;

        int count = 0;
        do {
            System.out.print("digite uma letra: ");
            String letra = scan.next();
            
            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                quantConsoantes++;
            }
            count++;
        } while (count < consoantes.length);

        System.out.println("quantidade de consoantes: "+ quantConsoantes);
        for (String consoante : consoantes) {
            if (consoante != null) {
                System.out.print(consoante + " ");
            }
            
        }
    }
}
