import java.util.ArrayList;

public class KlientIwidualny extends Klient{
     final String PESEL;

    public KlientIwidualny(String imie, String nazwisko, ArrayList<Zamowienie> zamowienia, String PESEL) {
        super(imie, nazwisko, zamowienia);
        this.PESEL = PESEL;
    }


}
