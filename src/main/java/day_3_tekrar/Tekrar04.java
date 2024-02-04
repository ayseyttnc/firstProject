package day_3_tekrar;

import java.util.Scanner;

public class Tekrar04 {
    public static void main(String[] args) {
////        Scanner scan = new Scanner(System.in);
////        System.out.println("lutfen 2 sayi giriniz");
//        int toplam=0;
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        for (int i = a; i <=b ; i++) {
//            toplam=toplam+i;
//        }
////        System.out.println(toplam);
//
////        System.out.println("..........................");
////        System.out.println("lutfen 10 dan kucuk bir sayi giriniz");
//        int factorial=1;
//        int sayi= scan.nextInt();
//
//        for (int i = 1; i <= sayi; i++) {
//factorial=factorial+i;
//        }
////        System.out.println(sayi+"! "+factorial);
//
//        System.out.println(".........................");

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen pozitif bir rakam giriniz");
        int rakam = input.nextInt();

        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println(" ");
        }


        System.out.println("lutfen bir rakam giriniz");
        int result=input.nextInt();

        for (int i =1; i <= 10; i++) {
            for (int j = 1; j <i ; j++) {


                System.out.println(i+"*"+j+"="+result);
                result=result+(i*j);
            }
            System.out.println(result);
    }
}


}
