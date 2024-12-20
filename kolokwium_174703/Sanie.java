import java.util.ArrayList;
import java.util.Objects;

public class Sanie {
    private ArrayList<Renifer> Sanie;

    public Sanie(ArrayList<Renifer> sanie) {
        if(sanie.isEmpty()){
            throw new IllegalArgumentException("Sanie cannot be empty");
        }
        Sanie = sanie;
    }

    public ArrayList<Renifer> getSanie() {
        return Sanie;
    }

    public void setSanie(ArrayList<Renifer> sanie) {
        if(sanie.isEmpty()){
            throw new IllegalArgumentException("Sanie cannot be empty");
        }
        Sanie = sanie;
    }

    public void dodajRenifera(Renifer renifer) {
        Sanie.add(renifer);
    }
    public int sumaPredkosci(){
        int suma = 0;
        for (Renifer renifer : Sanie) {
            suma += renifer.getPredkosc();
        }
        return suma;
    }
    public Renifer najwolniejszyRenifer(){
        Renifer najwolniejszy = Sanie.getFirst();
        for (Renifer renifer : Sanie) {
            if(renifer.getPredkosc() < najwolniejszy.getPredkosc()) najwolniejszy = renifer;
        }
        return najwolniejszy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sanie sanie = (Sanie) o;
        return Objects.equals(Sanie, sanie.Sanie);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Sanie);
    }

    @Override
    public String toString() {
        return "Sanie{" +
                "Sanie=" + Sanie +
                '}';
    }
}
