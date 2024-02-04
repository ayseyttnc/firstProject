package D13_tekrar;

import java.util.Arrays;

public class Arrays_omer {
    public static void main(String[] args) {
        String[] fruits=new String[5];
        fruits[0]="elma";
        fruits[1]="armut";
        fruits[2]="cilek";
        fruits[3]="kiraz";
        fruits[4]="muz";

        System.out.println(Arrays.toString(fruits));
        System.out.println(fruits[0]);

        for (int i = 0; i < fruits.length; i++) {

        System.out.println(fruits[i]);

        }
        for (String k: fruits){
            System.out.println(k);

        }
        System.out.println("Arrays_omer.main");
        String[] a={"elma","armut","cilek"};
        System.out.println(a[0]);
        a[0]="muz";

        System.out.println(a[0]);
    }
}
