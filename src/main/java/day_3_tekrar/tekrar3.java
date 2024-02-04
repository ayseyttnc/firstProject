package day_3_tekrar;

import java.util.Scanner;

public class tekrar3 {
    public static void main(String[] args) {
//
//        for (int i = 0; i <100; i++) {
////            System.out.print("java guzeldir");
//        }
//
//        for (int i = 10; i <=30 ; i++) {
////            System.out.print(i + " ,");
//        }
//        Scanner scan=new Scanner(System.in);
////        System.out.println("lutfen 100 den kucuk bir tam sayi giriniz");
//
//        for (int i = 1; i <100 ; i++) {
//            if (i%3==0 || i%5==0){
////                System.out.print("i = " + i);
//            }
//
//            Scanner input=new Scanner(System.in);
////            System.out.println("lutfen 100 den kucuk bir tam sayi giriniz");
//            int sayi= input.nextInt();
//            for (int j = 1; j <100 ; j++) {
//                if (sayi % 3 == 0) {
////                    System.out.println("=java");
//
//                } else if (sayi % 5 == 0) {
////                    System.out.println("guzeldir");
//                } else if (sayi % 3 == 0 && sayi % 5 == 0) {
////                    System.out.println("java guzeldir");
//
//                }
//
//            }
//        }



Scanner ntr=new Scanner(System.in);
        System.out.println("lutfen bir deger giriniz");
        String dgr= ntr.next().toLowerCase();
        for (int i = dgr.length()-1; i >=0 ; i--) {
            System.out.println(dgr.charAt(i));

        }

Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir deger giriniz");
String dgr2=scanner.nextLine().toLowerCase();
String yenidgr2="";

        for (int i = dgr2.length()-1; i >=0 ; i--) {
            yenidgr2+=dgr2.charAt(i);
            if (yenidgr2.equals(dgr2)){
                System.out.println("polindrome dir");
            }else {
                System.out.println("polindrome degildir");
            }

        }


    }
}
