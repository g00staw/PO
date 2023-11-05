import java.util.Scanner;

public class Samochod {
     String marka, model, nadwozie, kolor;
     int rokProdukcji, przebieg;

    public Samochod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj marke samochodu: ");
        this.marka=scanner.nextLine();
        System.out.println("Podaj model samochodu: ");
        this.model=scanner.nextLine();
        System.out.println("Podaj nadwozie samochodu: ");
        this.nadwozie=scanner.nextLine();
        System.out.println("Podaj kolor samochodu: ");
        this.kolor=scanner.nextLine();
        System.out.println("Podaj rok produkcji samochodu: ");
        this.rokProdukcji=scanner.nextInt();
        System.out.println("Podaj przebieg samochodu: ");
        this.przebieg=scanner.nextInt();
    }
    public Samochod(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg){
        this.marka=marka;
        this.model=model;
        this.nadwozie=nadwozie;
        this.kolor=kolor;
        this.rokProdukcji=rokProdukcji;
        this.przebieg=przebieg;
    }

    public void informacje(){
        System.out.println("\nmarka: "+marka+
                "\nmodel: "+model+
                "\nnadwozie: "+nadwozie+
                "\nkolor: "+kolor+
                "\nrok produkcji: "+rokProdukcji+
                "\nprzebieg: "+przebieg);
    }

}
