package day_3_tekrar;

import java.util.Scanner;

class tekrar_01Test {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("bir karakter giriniz");

        char chr = scanner.nextLine().charAt(0);
        int deger = chr;
//        Character.isLetter(chr);


//        if (Character.isLetter(chr)) {
//            System.out.println("is letter");

        if ((deger >= 'a' && deger <= 'z') || (deger >= 'A' && deger <= 'Z')) {
            System.out.println("girilen deger bir harfdir");
        } else {
            System.out.println("girilen deger harf degildir");

//        }


            System.out.println("deger = " + deger);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("ucgenin kenar uzunluklarini giriniz");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a == b && b == c) {
            System.out.println("eskenar ucgendir");
        } else {
            System.out.println("eskenar ucgen degildir");
        }
    }
}
