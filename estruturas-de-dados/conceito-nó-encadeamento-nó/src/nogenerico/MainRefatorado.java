package nogenerico;

public class MainRefatorado {
    public static void main(String[] args) {
        
        NoRefatorado<String> no1 = new NoRefatorado<String>("conteudo no1");

        NoRefatorado<String> no2 = new NoRefatorado<String>("conteudo no2");
        no1.setProximoNo(no2);

        NoRefatorado<String> no3 = new NoRefatorado<String>("conteudo no3");
        no2.setProximoNo(no3);

        NoRefatorado<String> no4 = new NoRefatorado<String>("conteudo no4");
        no3.setProximoNo(no4);

        //no1->no2->no3->no4->null 

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}
