package day1;

import java.util.Scanner;

public class Co6_Scanner {
    public static void main(String[] args) {
//        kullanicidan kilosunu al ve vucut kitle indeksini goster
//        kilo/(boy*boy)
        Scanner scan=new Scanner(System.in);
        System.out.println("kilonunuzu giriniz");
        double kilo= scan.nextDouble();
        System.out.println("boyunu giriniz");
        double boy= scan.nextDouble();
        System.out.println(kilo/(boy*boy));

    }
}
