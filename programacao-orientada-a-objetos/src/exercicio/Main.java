package exercicio;

public class Main {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();

        carro1.setCor("azul");
        carro1.setModelo("BMW serie 3");
        carro1.setCapacidadeTanque(51);


        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.calcularValorEncherTanque(6.53));

        Carro carro2 = new Carro("preto", "nissan 350z", 54);

        // carro1.setCor("preto");
        // carro1.setModelo("nissan 350z");
        // carro1.setCapacidadeTanque(54);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.calcularValorEncherTanque(6.53));


    }
}
