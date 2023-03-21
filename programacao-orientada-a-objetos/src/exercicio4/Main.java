package exercicio4;

public class Main {
    public static void main(String[] args) {
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()}; // foi criado 3 objetos dentro de um vetor

        for (ClasseMae classe: classes) {
            classe.metodo1(); // vai ser chamado esse método em cada um dos objetos do vetor
        }

        System.out.println("");

        for(ClasseMae classe: classes){
            classe.metodo2();
        }

        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
