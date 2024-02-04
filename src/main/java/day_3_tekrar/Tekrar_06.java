package day_3_tekrar;

import java.util.Arrays;
import java.util.Scanner;

public class Tekrar_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen birinci sayiyi giriniz");
        int sayi1 = scanner.nextInt();
        System.out.println("lutfen ikinci sayiyi giriniz ");
        int sayi2 = scanner.nextInt();
        int i = 0;

        System.out.println("................");

        String[] std = new String[3];
        System.out.println(std);
        System.out.println(Arrays.toString(std));

        int[] sayi = new int[5];
        System.out.println(sayi);
        System.out.println(Arrays.toString(sayi));

        String[] isimler = new String[3];

        isimler[0] = "ali can";
        isimler[1] = "hasan";
        isimler[2] = "hakan";

        System.out.println(Arrays.toString(isimler));
        System.out.println(isimler[1]);


        String[] cities = new String[4];
        cities[0] = "bayburt";
        cities[1] = "hakkari";
        cities[2] = "gaziantep";
        cities[3] = "siirt";

        System.out.println(Arrays.toString(cities));

        int total = 0;

        for (String w : cities) {
            total = total + w.length();

        }
        System.out.println(total);

        int[] num = {4, 3, 6, 7, 8};
        System.out.println(Arrays.toString(num));
        for (int w : num) {
            if (w < 5) {
                System.out.println(w + " ,");

            }
        }

       int[] arr={2,3,4,5,76};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));





        System.out.println(Arrays.binarySearch(arr,2));
        System.out.println(Arrays.binarySearch(arr,3));
        System.out.println(Arrays.binarySearch(arr,4));
        System.out.println(Arrays.binarySearch(arr,5));
        System.out.println(Arrays.binarySearch(arr,10));





    }


}
