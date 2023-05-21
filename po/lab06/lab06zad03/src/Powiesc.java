public class Powiesc extends Ksiazka{
    String tematyka;

    public Powiesc(String autor, String tytul, double cena, String tematyka){
        super(autor,tytul,cena);
        this.tematyka=tematyka;
    }
    public void informacje(){
        super.informacje();
        System.out.println("tematyka: "+tematyka);
    }
}
