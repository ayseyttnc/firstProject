package d21oop;

public class Honda extends Car {

    public String model = "Civic";
    public int year = 2023;
    public Honda() {
//        1.

        System.out.println("super.model = " + super.model);
        System.out.println("this.year = " + this.year);
        System.out.println("civic");
    }
    public Honda(String model){
        super("sport");
        System.out.println("accord");

    }


}
