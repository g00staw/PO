import java.util.ArrayList;
import java.util.List;
public class Klient{
    private String dane;

    private List<Ksiazka> wypozyczoneKsiazki;

    public Klient(String dane) {
        this.dane = dane;
        wypozyczoneKsiazki = new ArrayList<>();
    }
    public String getDane(){
        return dane;
    }

    public void wypozyczKsiazke(Ksiazka ksiazka) {
        wypozyczoneKsiazki.add(ksiazka);
    }

    public void zwrocKsiazke(Ksiazka ksiazka) {
        wypozyczoneKsiazki.remove(ksiazka);
    }

    public List<Ksiazka> getWypozyczoneKsiazki() {
        return wypozyczoneKsiazki;
    }

}
