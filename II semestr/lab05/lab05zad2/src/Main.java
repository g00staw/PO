public class Main {
    public static void main(String[] args) {
        Building BD1 = new Building(1980,34,"wiezowiec");
        Building BD2 = new Building(2010,1,"dom");
        Building BD3 = new Building(2015,10,"blok mieszkalny");

        BD1.information();
        BD2.information();
        BD3.information();
    }
}