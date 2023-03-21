package arrays.exe1;

public class OrdemInversa {
    public static void main(String[] args) {
        
        int [] nome = {8, 2, 3, 5, 1, 9};

        for (int i = nome.length -1; i >= 0; i--) {
            System.out.println("numero " + nome[i]);
        }        
    }
}
