package day_3_tekrar;

import java.util.Scanner;

public class DoLoopTekrar {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("java guzeldir");
        }
        //negatif bir deger girilene kadar kullanicidan girisleri
        // kabul eden ve girilen degerlerden cift sayilari toplayan program yaziniz

        Scanner input = new Scanner(System.in);
        int sayi;
        int toplam = 0;
        do {
            System.out.println("siz negatif bir sayi girene kadar toplamaya devam edecektir");

            sayi = input.nextInt();
            if (sayi % 2 == 0 && sayi > 0) {
                toplam += sayi;

            } else if (sayi % 2 == 1) {
                System.out.println("lutfen cift sayi giriniz");
            }
        } while (sayi > 0);
        System.out.println("toplam = " + toplam);


        //  kullanicidan pozitif bir tamsayi alip
        // do while loop ile sayidan kucuk pozitif tamsayilari yazdiralim
        //ve bu tamsayilarin toplamını alınız
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen pozitif bir tam sayi giriniz");
        int sayi1 = scan.nextInt();
        int counter = 1;

        int toplam1 = 0;

        do {
            if (sayi1 > 0) {
                System.out.println(counter + " ");
                toplam1 += counter;
            } else {
                System.out.println("lutfen pozitif bir sayi girerek tekrar deneyiniz");
            }
            counter++;
        } while (counter <= sayi1);
        System.out.println("toplam = " + toplam1);


//        kullanıcı c tusuna basana kadar islem yapmaya devam eden bir hesap makinesi yapınız

        char operator;
        do {
            System.out.println("lutfen + - * / ^  islemlerinden birini seciniz");
            operator = input.next().charAt(0);

            switch (operator) {
                case '+':
                    System.out.println("islem yapmak istediginiz satilari giriniz");
                    System.out.println("sayilarin toplami :" + input.nextDouble() + input.nextDouble());
                    break;
                case '-':
                    System.out.println("islem yapmak istediginiz sayilari giriniz");
                    System.out.println("sayilarin farki:" + (input.nextDouble() - input.nextDouble()));
                    break;
                case '/':
                    System.out.println("islem yapmak istediginiz satilari giriniz");
                    System.out.println("sayilarin bolumu :" + input.nextDouble() / input.nextDouble());
                    break;
                case '*':
                    System.out.println("islem yapmak istediginiz satilari giriniz");
                    System.out.println("sayilarin carpimi :" + input.nextDouble() * input.nextDouble());
                    break;

                case '^':
                    System.out.println("islem yapmak istediginiz satilari giriniz");
                    System.out.println("sayilarin kuvveti :" + Math.pow(input.nextDouble(), input.nextDouble()));
                    break;
                default:
                    System.out.println("lutfen gecerli biroperator giriniz");
                    break;
                case 'c':
                    System.out.println("bizitercih ettiginiz icin tesekkurler tekrar bekleriz");
            }
        } while (operator != 0);


    }

}
