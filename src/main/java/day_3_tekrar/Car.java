package day_3_tekrar;

public class Car {
    String brand="honda";
    String model="accord";
    int year=2023;
    boolean hybrid=true;

    public void hareket(){
        System.out.println(brand+"hizli hareket eder");
    }
    public void dur(){
        System.out.println(brand + "guvenli bir sekilde durur");
    }

    public Car(String brand, String model, int year, boolean hybrid){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
