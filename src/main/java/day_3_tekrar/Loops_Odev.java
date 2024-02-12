package day_3_tekrar;

import java.util.Scanner;

public class Loops_Odev {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int tamSayi;

        System.out.println("lutfen 100 den kucuk bir tamsayi giriniz");
        tamSayi = input.nextInt();

        if (tamSayi < 100) {
            for (int i = 1; i <= tamSayi; i++) {
                if (i % 5 == 0 && i % 3 == 0) {
                    System.out.println("java guzeldir");
                } else if (i % 3 == 0) {
                    System.out.println("java");
                } else if (i % 5 == 0) {
                    System.out.println("guzeldir");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("yuzden kucuk bir sayi giriniz");
        }

    }
}
