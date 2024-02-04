package day1;

import java.util.Scanner;

public class Co5_Scanner {
    public static void main(String[] args) {
//        kullanicidan bir sayi al ve karesini bul
        Scanner scan= new Scanner(System.in);
        System.out.println("bir sayi giriniz:");
        int sayi= scan.nextInt();
//        sayinin kareisini al
        System.out.println("karesi:" + sayi*sayi);

    }
}
