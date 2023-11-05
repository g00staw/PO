public class Gatunek {
    private String rodzaj;
    private String gatunek;
    private int liczbaChromosomow2n;
    private int podstawowaLiczbaChromosomowX;
    private String opis;

    public Gatunek(String rodzaj, String gatunek, int liczbaChromosomow2n, int podstawowaLiczbaChromosomowX, String opis){
        this.rodzaj = rodzaj;
        this.gatunek = gatunek;
        this.liczbaChromosomow2n = liczbaChromosomow2n;
        this.podstawowaLiczbaChromosomowX = podstawowaLiczbaChromosomowX;
        this.opis = opis;
    }

    public String pelnaNazwa(){
        return rodzaj + " " + gatunek;
    }

    public int liczbaChromosomowN(){
        return liczbaChromosomow2n / 2;
    }

    public void wypiszDane(){
        System.out.println("Nazwa rodzaju: " + rodzaj);
        System.out.println("Nazwa gatunkowa: " + gatunek);
        System.out.println("Liczba chromosomów 2n: " + liczbaChromosomow2n);
        System.out.println("Podstawowa liczba chromosomów x: " + podstawowaLiczbaChromosomowX);
        System.out.println("Opis: " + opis);
    }

    public Gatunek klonuj() {
        return new Gatunek(rodzaj, gatunek, liczbaChromosomow2n, podstawowaLiczbaChromosomowX, opis);
    }
}
