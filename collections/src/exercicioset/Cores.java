package exercicioset;
import java.lang.Comparable;

public class Cores implements Comparable<Cores>{
    String cores;

    public Cores(String cores) {
        this.cores = cores;
    }

    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cores == null) ? 0 : cores.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cores other = (Cores) obj;
        if (cores == null) {
            if (other.cores != null)
                return false;
        } else if (!cores.equals(other.cores))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Cores [cores=" + cores + "]";
    }

    @Override
    public int compareTo(Cores outraCor) {
        return this.cores.compareTo(outraCor.cores);
    }

}
