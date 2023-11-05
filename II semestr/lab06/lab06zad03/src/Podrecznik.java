public class Podrecznik extends Ksiazka {
    String przedmiot;
    String material;
    public Podrecznik(String autor, String tytul, double cena, String przedmiot, String material){
        super(autor,tytul,cena);
        this.przedmiot=przedmiot;
        this.material=material;

    }
    public void informacje(){
        super.informacje();
        System.out.println("przedmiot: "+przedmiot+
                "\nmaterial: "+material);
    }
}
