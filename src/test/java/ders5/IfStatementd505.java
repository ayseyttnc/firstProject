package ders5;

import java.util.Scanner;

public class IfStatementd505 {
    public static void main(String[] args) {
//        kullanicidan yas degeri alan ve yasin evrede oldugunu asagidaki yere toploya gore yazdiran kod

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen yasiniizi giriniz");
        int age= input.nextInt();

        if (age<0) {
            System.out.println("gecerli bir yas giriniz");

        } else if (age<5) {
            System.out.println("bebek");

        } else if (age<13) {
            System.out.println("cocuk");

        } else if (age<21) {
            System.out.println("genc");

        } else if (age<31) {
            System.out.println("yetiskin");

        } else {
            System.out.println("tanimlanmamis yas");

        }
    }
}
