public class Main {
    public static void main(String[] args) {
        Gatunek gatunek1 = new Gatunek("Ssak", "Lew", 38, 19, "Duży drapieżnik");
        Gatunek gatunek2 = new Gatunek("Ptak", "Orzeł", 34, 17, "Drapieżny ptak");

        System.out.println("Pełna nazwa gatunku 1: " + gatunek1.pelnaNazwa());
        System.out.println("Haploidalna liczba chromosomów gatunku 1: " + gatunek1.liczbaChromosomowN());

        gatunek1.wypiszDane();
        Gatunek klonowanyGatunek = gatunek1.klonuj();
        System.out.println("Skopiowany gatunek:");
        klonowanyGatunek.wypiszDane();

    }
}