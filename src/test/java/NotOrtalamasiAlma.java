import java.util.Scanner;

public class NotOrtalamasiAlma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int matemetik,turkce,fenBilgisi,bedenEgitimi;
        System.out.println("matematik notunu giriniz:");
        matemetik= scan.nextInt();
        System.out.println("turkce notunu giriniz:");
        turkce= scan.nextInt();
        System.out.println("fen bilgisi notunu giriniz:");
        fenBilgisi= scan.nextInt();
        System.out.println("beden egitimi notunu giriniz:");
        bedenEgitimi= scan.nextInt();
        double ortalama;
        ortalama=(matemetik+turkce+fenBilgisi+bedenEgitimi)/4;
        ortalama= scan.nextDouble();

        if (ortalama<50){
            System.out.println("sinifta kaldiniz ! seneye gorusuruz.");}
        else {
            System.out.println("sinifta sinifi gectiniz! seneye gorusuruz.");}

        }


    }

