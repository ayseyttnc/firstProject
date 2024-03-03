package d21oop;

public class Car extends Vehicle {
    public String model = "accord";
    public int year = 2024;


    public Car(){
//        2.
        super();
        System.out.println("sedan");
    }

    public Car(String tip){
        super("honda",2024,"ellektirkli");
        System.out.println("sport");
    }
}
