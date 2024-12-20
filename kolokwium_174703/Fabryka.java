import java.util.ArrayList;
import java.util.Objects;

public class Fabryka {
    private ArrayList<Elf> Elfy;
    private int dlGeo;
    private int szGeo;

    public Fabryka(ArrayList<Elf> elfy, int dlGeo, int szGeo) {
        if(elfy.isEmpty()){
            throw new IllegalArgumentException("Elfy cannot be empty");
        }
        Elfy = elfy;
        if(dlGeo > 180 || dlGeo < -180) {
            throw new IllegalArgumentException("dlGeo must be between -180 and 180");
        }
        this.dlGeo = dlGeo;
        if(szGeo > 90 || szGeo < -90) {
            throw new IllegalArgumentException("szGeo must be between -90 and 90");
        }
        this.szGeo = szGeo;
    }

    public ArrayList<Elf> getElfy() {
        return Elfy;
    }

    public void setElfy(ArrayList<Elf> elfy) {
        if(elfy.isEmpty()){
            throw new IllegalArgumentException("Elfy cannot be empty");
        }
        Elfy = elfy;
    }

    public int getDlGeo() {
        return dlGeo;
    }

    public void setDlGeo(int dlGeo) {
        if(dlGeo > 180 || dlGeo < -180) {
            throw new IllegalArgumentException("dlGeo must be between -180 and 180");
        }
        this.dlGeo = dlGeo;
    }

    public int getSzGeo() {
        return szGeo;
    }

    public void setSzGeo(int szGeo) {
        if(szGeo > 90 || szGeo < -90) {
            throw new IllegalArgumentException("szGeo must be between -90 and 90");
        }
        this.szGeo = szGeo;
    }

    public void dodajPracownika(Elf elf) {
        Elfy.add(elf);
    }

    public void usunPracownika(Elf elf) {
        Elfy.remove(elf);
    }

    public Elf najstarszyPracownik(){
        ArrayList<Elf> elfy = Elfy;
        Elf najstarszy = Elfy.getFirst();
        for (Elf elf : Elfy) {
            if(elf.getWiek() > najstarszy.getWiek()) najstarszy = elf;
        }
        return najstarszy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fabryka fabryka = (Fabryka) o;
        return dlGeo == fabryka.dlGeo && szGeo == fabryka.szGeo && Objects.equals(Elfy, fabryka.Elfy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Elfy, dlGeo, szGeo);
    }

    @Override
    public String toString() {
        return "Fabryka{" +
                "Elfy=" + Elfy +
                ", dlGeo=" + dlGeo +
                ", szGeo=" + szGeo +
                '}';
    }
}
