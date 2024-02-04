package D11_Konu_tekrari_new;

import java.util.Scanner;

public class Genel_konu_tekrari {
    public static void main(String[] args) {
        String orginal = "merhaba dunya ";
        String sub = orginal.substring(0, 14);
        System.out.println(sub);
        String sub2 = orginal.substring(4);
        String sub3 = orginal.substring(2, 7);
        System.out.println(sub2 + "  " + sub3);

        System.out.println("..................");

        String orginal2 = "guzel olmayn sen";
        String sub4 = orginal2.substring(0, 4);
        System.out.println(sub4);

        System.out.println(".................");
        String orginal3 = "merhaba.,nasilsin?";
        String sub5 = orginal3.replace(",", "?");
        System.out.println("orginal3 = " + sub5);

        System.out.println("................");
        String orginal4 = "merhaba ev sakinlari ev e hosgeldiniz . ev sizi bekliyor";
        String sub7 = orginal4.replaceAll("ev", "home");
        System.out.println(sub7);

        System.out.println("...............");

        String str = "nasilsin";
        int sub8 = str.indexOf("nas");
        System.out.println("sub8 = " + sub8);

        System.out.println("..............");
        String last = "nasilsin iyimizin";
        int sub9 = last.lastIndexOf("iyimizin");
        System.out.println("sub9 = " + sub9);


        System.out.println("...........");

        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {

                System.out.println(i);
            }
            i++;
            System.out.println("!!!!!!!!!!!!!!!!!!!");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");

        int k = scan.nextInt();
        if (k < 0) {
            System.out.println("negatif sayi girdu=iniz");
        } else if (k > 0) {
            System.out.println("say pozifse sayinin kub=vvetini giriniz :" + k * k);

        }

    }
}