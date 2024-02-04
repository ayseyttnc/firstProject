package ders5;

import java.util.Scanner;

public class IfStatementD503 {
    public static void main(String[] args) {
//        daha fazla durumlu senaryolarda if--else if -else ststementskullanilir
        Scanner input= new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int num= input.nextInt();
        if (num>0) {
            System.out.println(num + " sifirdan buyukutur");
        } else if (num<0) {
            System.out.println(num+ " sifirdan kucuktur");

        }else {
            System.out.println(num+ " notrdur");

        }
    }
}
