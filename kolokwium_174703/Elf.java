import java.util.Objects;

public class Elf {
    private String imie;
    private int wiek;
    private String stanowisko;

    public Elf(String imie, int wiek, String stanowisko) {
        if (imie == null || imie.isEmpty()) {
            throw new IllegalArgumentException("imie must not be empty");
        }
        this.imie = imie;
        if (wiek < 0) {
            throw new IllegalArgumentException("wiek must not be negative");
        }
        this.wiek = wiek;
        if (stanowisko == null || stanowisko.isEmpty()) {
            throw new IllegalArgumentException("stanowisko must not be empty");
        }
        this.stanowisko = stanowisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if (imie == null || imie.isEmpty()) {
            throw new IllegalArgumentException("imie must not be empty");
        }
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if (wiek < 0) {
            throw new IllegalArgumentException("wiek must not be negative");
        }
        this.wiek = wiek;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        if (stanowisko == null || stanowisko.isEmpty()) {
            throw new IllegalArgumentException("stanowisko must not be empty");
        }
        this.stanowisko = stanowisko;
    }


    void przedstawSie(){
        System.out.println("Cześć, nazywam się "
                + this.imie
                + ", mam " + this.wiek
                + " lat, a moje stanowisko pracy to "
                + this.stanowisko);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elf elf = (Elf) o;
        return wiek == elf.wiek && Objects.equals(imie, elf.imie) && Objects.equals(stanowisko, elf.stanowisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, wiek, stanowisko);
    }

    @Override
    public String toString() {
        return "Elf{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", stanowisko='" + stanowisko + '\'' +
                '}';
    }
}
