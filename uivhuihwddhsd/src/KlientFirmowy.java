import java.util.ArrayList;

public class KlientFirmowy extends Klient{
    final String NIP;
    final String REGON;
    int imie;
    int nazwisko;
    public KlientFirmowy(String NIP, String REGON, String imie, String nazwisko,  ArrayList<Zamowienie> zamowienia){
        super(imie, nazwisko,   zamowienia);
        this.NIP = NIP;
        this.REGON = REGON;
    }
}
