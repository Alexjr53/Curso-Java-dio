package exercicio3;

public class Main {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario(); //criei o objeto funcionario e coloquei dentro da variavel funcionario

        Funcionario gerente = new Funcionario();
        Funcionario vendedor = new Funcionario();// nessas 3 linhas foi feito o Upcast, transformei um subclasse (ou classe filha) em uma classe mãe.
        Funcionario faxineiro = new Funcionario();


        Vendedor vendedor_ = (Vendedor) new Funcionario();// e esse é um exemplo de Downcast
                                                            //que trasnforma uma classe mãe em uma classe filha
                                                            //e nesse caso eu tenho que definir entre parentes para qual subclasse a classe mãe irá se trasnformar
    }
}
