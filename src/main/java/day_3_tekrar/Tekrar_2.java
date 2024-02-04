package day_3_tekrar;

import java.util.List;
import java.util.Scanner;

public class Tekrar_2 {
    public static void main(String[] args) {

        //way 1
        System.out.println("gun girin");
        Scanner scanner = new Scanner(System.in);
        List<String> days = List.of("monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday");

        String day = scanner.nextLine().toLowerCase();

        if (
            //way 1
                days.contains(day)

            //way 2
//                day.equals("monday") ||
//                        day.equals("tuesday") ||
//                        day.equals("wednesday") ||
//                        day.equals("thursday") ||
//                        day.equals("friday") ||
//                        day.equals("saturday") ||
//                        day.equals("sunday")

        ) {
            String firstLetter = String.valueOf(day.charAt(0)).toUpperCase();
            String secondLetter = String.valueOf(day.charAt(1)).toUpperCase();
            String thirdletter = String.valueOf(day.charAt(2)).toUpperCase();
            String fourthAndRest = day.substring(3);

            String newWord = firstLetter + secondLetter + thirdletter + fourthAndRest;
//            System.out.println("newWord = " + newWord);

        } else {
//            System.out.println("gecerli bir gun ismi giriniz");
        }
//         // way 2
//        String day = "monday";
//
//        String ilkUcKarakter = day.substring(0, 3).toUpperCase();
//        String geriKalani = day.substring(3);
//        System.out.println("ilkUcKarakter = " + ilkUcKarakter + geriKalani);


        Scanner input = new Scanner(System.in);
//        System.out.println("iki sayi giriniz");
        int a = input.nextInt();
        int b = input.nextInt();

        if (a > 0 && b > 0) {
//            System.out.println(a+b);
        } else if (a < 0 && b < 0) {
            System.out.println(a * b);

        } else if (a < 0 && b > 0 || a > 0 && b < 0) {
//            System.out.println("farkli isarette sayilarla islem yapamazsiniz");

        } else if (a == 0 || b == 0) {


//        System.out.println("sifir carpmaya gore yutan elemandir");
        }
//    else{
//            System.out.println("yanlis karakter girdiniz lutfen sayi giriniz");}

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 basamakli bir sayi giriniz");
        String sayi=scan.nextLine();

    }
}
