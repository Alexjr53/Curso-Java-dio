package exercicio1;

public class Main {

    public static void main(String[] args) {
        
        Calculadora.somar(5, 10);
        Calculadora.subtrair(35, 7);
        Calculadora.multiplicar(5, 5);
        Calculadora.dividir(50, 10);

        int horaDoDia = 4;

        if(horaDoDia >= 5 && horaDoDia <= 12 ) {
            Mensagem.BomDia();
        }else if (horaDoDia >= 13 && horaDoDia <= 18) {
            Mensagem.BomTarde();
        }else{
            Mensagem.BoaNoite();
        }
            
        
            
        
    }

}