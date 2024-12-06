import java.util.Objects;

public class Produkt {
    String _nazwa;
    double _cena;

    public String get_nazwa() {
        return _nazwa;
    }

    public void set_nazwa(String _nazwa) {
        this._nazwa = _nazwa;
    }

    public double get_cena() {
        return _cena;
    }

    public void set_cena(double _cena) {
        this._cena = _cena;
    }

    public int get_iloscNaMagazynie() {
        return _iloscNaMagazynie;
    }

    public void set_iloscNaMagazynie(int _iloscNaMagazynie) {
        this._iloscNaMagazynie = _iloscNaMagazynie;
    }

    int _iloscNaMagazynie;
    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        _nazwa = nazwa;
        _cena = cena;
        _iloscNaMagazynie = iloscNaMagazynie;
    }
    public void wyswietlInformacje() {
        System.out.println("Nazwa: " + _nazwa);
        System.out.println("Cena: " + _cena);
        System.out.println("Ilosc na Magazynie: " + _iloscNaMagazynie);
    }
    public boolean DodajDoMagazynu(int ilosc){
        try{
            this._iloscNaMagazynie += ilosc;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }
    public boolean UsunZMagazynu(int ilosc) {
        try {
            if (_iloscNaMagazynie > ilosc) {
                _iloscNaMagazynie-=ilosc;
                return true;
            }
            return false;
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return Double.compare(_cena, produkt._cena) == 0 && _iloscNaMagazynie == produkt._iloscNaMagazynie && Objects.equals(_nazwa, produkt._nazwa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_nazwa, _cena, _iloscNaMagazynie);
    }
}
