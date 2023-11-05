import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Ksiazka ksiazka1 = new Ksiazka("Zbigniew Nowak","ksiazka",33.22);
        ksiazka1.informacje();
        Podrecznik podrecznik1 = new Podrecznik("Adam Kowal","Matematyka zbior zadan",33.99,"Matematyka","Szkola srednia");
        podrecznik1.informacje();
        Powiesc powiesc1 = new Powiesc("Marcin Kowalski","zyx",45.15,"fantastyka");
        powiesc1.informacje();

        Powiesc powiesc2 = new Powiesc("Z. Mamba","abba",12.77,"nic");
        Ksiazka ksiazka2 = (Powiesc) powiesc2;
        ksiazka2.informacje();

        Ksiegarnia ksiegarnia = new Ksiegarnia();
        ksiegarnia.dodajKsiazke(ksiazka1);

        List<Ksiazka> ksiazki = ksiegarnia.getKsiazki();
        for (Ksiazka ksiazka : ksiazki) {
            System.out.println("tytul: " + ksiazka.getTytul());
            System.out.println("autor: " + ksiazka.getAutor());
            System.out.println();
        }
        Klient klient = new Klient("Wiktor Kucharski");
        klient.wypozyczKsiazke(ksiazka2);

        List<Ksiazka> klientKsiazki = klient.getWypozyczoneKsiazki();
        System.out.println("Ksiazka wypozyczona przez " + klient.getDane() + ":");
        for (Ksiazka ksiazka : klientKsiazki) {
            System.out.println("tytul - " + ksiazka.getTytul());
        }
        System.out.println();
    }
}