package d20instanceblock_oop;

public class InstanceBlock3_runner {
    public static void main(String[] args) {


        InstanceBlock3 car1 = new InstanceBlock3();

    InstanceBlock3 car2=new InstanceBlock3("kirmizi","diesel");
        System.out.println("araba rengi: "+car2.color);
        System.out.println("araba yakit turu: "+car2.fuelType);

        System.out.println(car2);
    }
}
