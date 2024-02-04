package day_3_tekrar;

import java.util.Scanner;

public class Tekrar_05 {
    public static void main(String[] args) {
        int input = 15;
        if (input < 100) {

            if (input % 3 == 0 && input % 5 == 0) {
                System.out.println("java guzeldir");
            } else if (input % 5 == 0) {
                System.out.println("guzeldir");
            } else if (input % 3 == 0) {
                System.out.println("java");
            }

        } else {
            System.out.println("yanlis");
        }


//            Scanner inpt = new Scanner(System.in);
//            System.out.println("Lutfen Bir Sayi Giriniz");
        int sayi = 4;
        long fak = 1L;

        if (sayi < 0) {
            System.out.println("Negatif sayıların faktöriyeli hesaplanamaz.");
        } else {
            // Faktöriyel hesaplama döngüsü
            for (int i = 1; i <= sayi; i++) {
                fak *= i;
            }
            System.out.println(sayi + "! = " + fak);
        }

        int sayi1 = 3;
        while (sayi1 <= 13) {
            sayi1++;

            if (sayi1 % 2 == 1) {
                System.out.println(sayi1);

            }
        }
        int i = 100;

        while (i <= 999) {
            i++;

            if (i % 3 == 0 && i % 5 == 0&& i%90==0) {
                System.out.println(i);

            }


        }
    }
}

