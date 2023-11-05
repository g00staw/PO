import java.util.ArrayList;
import java.util.List;
public class Ksiegarnia {
    List<Ksiazka> ksiazki;

    public Ksiegarnia() {
        ksiazki = new ArrayList<>();
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        ksiazki.add(ksiazka);
    }

    public void usunKsiazke(Ksiazka ksiazka) {
        ksiazki.remove(ksiazka);
    }

    public List<Ksiazka> getKsiazki() {
        return ksiazki;
    }
}
