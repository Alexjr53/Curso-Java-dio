package one.digitalinovation;

import java.util.Objects;

public class Carro implements Comparable<Carro> {

    String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Carro)) {
            return false;
        }
        Carro carro = (Carro) o;
        return Objects.equals(marca, carro.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(marca);
    }


    @Override
    public String toString() {
        return "{" +
            " marca='" + getMarca() + "'" +
            "}";
    }

    @Override
    public int compareTo(Carro o) {
        if (this.marca.length() < o.marca.length()) {
            return -1;
        }else if (this.marca.length() > o.marca.length()) {
            return 1;
        }
        return 0;
    }


}