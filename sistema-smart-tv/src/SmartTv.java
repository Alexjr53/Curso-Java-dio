public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("aumentando o volume para: "+volume);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void ligar(){
        ligada = true; 
    }

    public void desligar(){
        ligada = false; 
    }
}