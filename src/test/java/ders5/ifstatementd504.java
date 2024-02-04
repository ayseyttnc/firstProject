package ders5;

import java.util.Scanner;

public class ifstatementd504 {
    public static void main(String[] args) {
//        kullanicidan gun sayisi aldiginizda gun ismini yazan kodu yaziniz
//        1==pazar ,2==pazartesi,..
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen kacinci gun oldugunu giiniz");
        int num= input.nextInt();
        if (num <= 1){
            System.out.println("gun sayilarini 1 den kucuk olamaz");
    } else if (num==1) {
            System.out.println("pazar");
        } else if (num==2) {
            System.out.println("pazartesi");
        } else if (num==3){
            System.out.println("sali");
        } else if (num==4) {
            System.out.println("carsamba");
        } else if (num==5) {
            System.out.println("persembe");
        } else if (num==6) {
            System.out.println("cuma");

        } else if (num==7) {
            System.out.println("cumartesi");

        } else {
            System.out.println("gun sayilari 7 den kucuk olamaz");

        }

        }
    }
