package day_3_tekrar;

import java.util.Scanner;

public class tekrar_01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("sayicifttir");

        } else {
            System.out.println("sayi tektir");
        }
        System.out.println("...........................");
        Scanner input = new Scanner(System.in);
        String gun;
        System.out.println("lutfen bir gun ismi giriniz");
        gun = input.nextLine();

        if (gun.equalsIgnoreCase("p")) {
            System.out.println(" pazar,pazartesi,persembe");

        } else if (gun.equalsIgnoreCase("s")) {
            System.out.println("sali");
        } else if (gun.equalsIgnoreCase("c")) {
            System.out.println("carsamba, cuma ,cumartesi");
        } else {
            System.out.println("yanlis harf girdiniz. lutfen tekrar deneyiniz");

        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("dikdortgenin kenar uzunlugunu giriniz");
        double uzunluk = scanner.nextDouble();

        System.out.println("dikdortgenin kenar genisligini giriniz");
        double genislik = scanner.nextDouble();


        if (uzunluk == genislik) {
            System.out.println("bu bir karedir");
        } else {
            System.out.println("bu bir dikdortgendir");
        }
        Scanner inpt = new Scanner(System.in);
        System.out.println("lutfen gun ismi giriniz");
        String re_gun = inpt.next();

        if (re_gun == "cuma") {
            System.out.println("muslumanlar icin kutsal gun");
        } else if (re_gun == "cumartesi") {
            System.out.println("yahudiler icin kutsal gun");

        } else if (re_gun == "pazar") {
            System.out.println("hristiyanlar icin kutsal gun");

        } else {
            System.out.println("yanlis gun ismi girdiniz");
        }
        Scanner intr = new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        String karakter = intr.nextLine().toUpperCase();


        if (Character.isLetter(0)) {
            System.out.println("karakter harf degildir");

        } else {
            System.out.println("karakter harf degildir");
        }


    }


}

