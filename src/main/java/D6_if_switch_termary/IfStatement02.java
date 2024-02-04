package D6_if_switch_termary;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
//        nested ici ice gecmis demektir
       /*ornek 1:
    Kisi erkek ise;
          i)16 yasindan kucuk ise calismamali
          ii)16 - 65(Dahil) arasi calismali
          iii)65 yasindan buyuk ise emekli olmali
    Kisi kadin ise;
         i)18 yasindan kucuk ise calismamali
         ii)18 - 60 (dahil) arasi calismali
         iii)60 yasindan buyuk ise emekli olmali
   Kisinin cinsiyetine ve yasina bakarak uygun mesaji console'a yaziniz*/

        Scanner input = new Scanner(System.in);

        System.out.println("cinsiyetinizi giriniz");
        String gender = input.next();

        System.out.println("yasinizi giriniz");
        int age = input.nextInt();

        if (gender.equalsIgnoreCase("erkek")) {
            if (age < 0) {
                System.out.println("yas negatif olamaz");

            } else if (age < 16) {

                System.out.println("calismamali");
            } else if (age <= 65) {
                System.out.println("calismali");
            } else {
                System.out.println("emekli olmali");
            }
        } else if (gender.equalsIgnoreCase("kadin")) {
            if (age < 0) {
                System.out.println("yas negatif olamaz");
            } else if (age < 18) {

                System.out.println("calismamli");
            } else if (age <= 60) {
                System.out.println("calismali");
            } else {
                System.out.println("emekli olmali");
            }
        } else {
            System.out.println("sizin icin farkli bir tanimlama yapilirsa");

        }
    }
}
