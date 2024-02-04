package ders5;

import java.util.Scanner;

public class IfStatementd502 {
    public static void main(String[] args) {
//  kullanicdan alinan bir sayinin tek mi cift mi oldugunu yazdir

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int num= input.nextInt();
        if (num%2==0){
            System.out.println("cift sayi");
        }
        if (num%2!=0) {
            System.out.println("tek sayi");

        }
//        if- else statement
        if (num%2==0){
            System.out.println("sayi cifttir");

        }
        else {
            System.out.println("sayi tektir");

        }



  }
}
