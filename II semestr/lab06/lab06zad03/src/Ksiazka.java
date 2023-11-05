public class Ksiazka {
    String autor;
    String tytul;
    double cena;

    public Ksiazka(){
        this.autor="";
        this.tytul="";
        this.cena=0;
    }
    public Ksiazka(String autor, String tytul, double cena){
        this.autor=autor;
        this.tytul=tytul;
        this.cena=cena;
    }
    public String getAutor() {
        return autor;
    }

    public String getTytul() {
        return tytul;
    }

    public double getCena() {
        return cena;
    }
    public void informacje(){
        System.out.println("autor: "+autor+
                "\ntytul: "+tytul+
                "\ncena: "+cena);
    }
}
