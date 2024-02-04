package D6_if_switch_termary;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        /*Ornek 1: Kullanicinin vermis oldugu gün isimlerine bakarak Hafta Sonu veya Hafta ici olduguna karar veren kodu yaziniz.
Pazartesi ==> Hafta ici       Cumartesi ==> Hafta sonu*
         */

        Scanner input = new Scanner(System.in);
        String gunismi;
        System.out.println("gun ismi giriniz");
        gunismi = input.next();
boolean haftasonu=(gunismi.equalsIgnoreCase("cumartesi")) || gunismi.equalsIgnoreCase("pazar");
      boolean haftaici=(gunismi.equalsIgnoreCase("pazartesi") ||
              gunismi.equalsIgnoreCase("sali") ||
              gunismi.equalsIgnoreCase("carsamba") || gunismi.equalsIgnoreCase("persembe")
              || gunismi.equalsIgnoreCase("cuma"));
    if (haftasonu){
        System.out.println("haftasonu");
    } else if (haftaici) {
        System.out.println("haftaici");


    }else {
        System.out.println("gecersiz bir girdiniz");
    }

    }

    }



