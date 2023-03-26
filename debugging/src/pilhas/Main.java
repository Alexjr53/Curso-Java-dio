package pilhas;

public class Main {
    public static void main(String[] args) {
        System.out.println("iniciou do programa no método main");
        a();
        System.out.println("finalizou do programa no método main");
    }

    static void a(){
        System.out.println("entrou no método a");
        b();
        System.out.println("entrou no método a");
    }

    static void b(){
        System.out.println("entrou no método b");
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
        c();
        System.out.println("finalizou o método b");
    }

    static void c(){
        System.out.println("entrou no método c");
        //Thread.dumpStack();
        System.out.println("finalizou o método c");
    }
    
}