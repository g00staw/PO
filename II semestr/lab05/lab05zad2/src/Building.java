import java.time.LocalDate;
public class Building {
    private int yearOfEnd, floors;
    private String name;
    public Building(int yearOfEnd, int floors, String name){
        this.floors=floors;
        this.yearOfEnd=yearOfEnd;
        this.name=name;
    }

    public int getYearOfEnd() {
        return yearOfEnd;
    }

    public void setYearOfEnd(int yearOfEnd) {
        this.yearOfEnd = yearOfEnd;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int ageOfBuilding(){
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int age = currentYear - yearOfEnd;
        return age;
    }
    public void information(){
        System.out.println("--------------------------" +
                "\n-- name:"+ name +
                "\n-- used from: "+ yearOfEnd +
                "\n-- floors: " + floors +
                "\n-- age: "+ ageOfBuilding());
    }





}
