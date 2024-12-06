import java.util.Objects;

interface Adres_{
    public String getUlica();
    public void setUlica(String ulica);
    public int getNumerDomu();
    public void setNumerDomu(int numerDomu);
    public int getNumerMieszkania();
    public void setNumerMieszkania(int numerMieszkania);
    public String getMiasto();
    public void setMiasto(String miasto);
    public int getKodPocztowy();
    public void setKodPocztowy(int kodPocztowy);
    public void pokaz();
    public boolean przed(Adres adres1, Adres adres2);
}

public class Adres implements Adres_ {
     String ulica;
     int numerDomu;
     int numerMieszkania;
     String miasto;
     int kodPocztowy;

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(int numerDomu) {
        this.numerDomu = numerDomu;
    }

    public int getNumerMieszkania() {
        return numerMieszkania;
    }

    public void setNumerMieszkania(int numerMieszkania) {
        this.numerMieszkania = numerMieszkania;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public int getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(int kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public Adres(int kodPocztowy, String miasto, String ulica, int numerMieszkania, int numerDomu) {
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
        this.numerMieszkania = numerMieszkania;
        this.numerDomu = numerDomu;
        this.ulica = ulica;
    }

    public Adres(int kodPocztowy, String miasto, String ulica, int numerDomu) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public void pokaz(){
        System.out.println("\nAdres: " + this.kodPocztowy + this.miasto);
        if (this.numerMieszkania != 0) {
            System.out.println("Mieszkanie: " + this.ulica + this.numerDomu);
        } else {
            System.out.println("Mieszkanie: " + this.ulica + this.numerDomu + this.numerMieszkania);
        }
    }
    public boolean przed(Adres adres1, Adres adres2){
        return adres1.kodPocztowy < adres2.kodPocztowy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adres adres = (Adres) o;
        return numerDomu == adres.numerDomu && numerMieszkania == adres.numerMieszkania && kodPocztowy == adres.kodPocztowy && Objects.equals(ulica, adres.ulica) && Objects.equals(miasto, adres.miasto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ulica, numerDomu, numerMieszkania, miasto, kodPocztowy);
    }
}
