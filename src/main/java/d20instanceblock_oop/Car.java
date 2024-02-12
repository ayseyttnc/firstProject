package d20instanceblock_oop;

public class Car extends Vehicle{
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
