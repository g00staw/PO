import java.util.Scanner;

public class SamochodOsobowy extends Samochod {
    int waga, iloscOsob;
    float pojemnoscSilnika;

    public SamochodOsobowy(){
        super();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wage samochodu: ");
        this.waga=scanner.nextInt();

        System.out.println("Podaj ilosc osob: ");
        this.iloscOsob= scanner.nextInt();

        System.out.println("Podaj pojemnosc silnika samochodu: ");
        this.pojemnoscSilnika=scanner.nextFloat();
    }
    public void informacje(){
        super.informacje();
        System.out.println(
                "\nwaga: "+waga+
                "\nilosc osob: "+iloscOsob+
                "\npojemnosc silnika: "+pojemnoscSilnika);
    }

}
