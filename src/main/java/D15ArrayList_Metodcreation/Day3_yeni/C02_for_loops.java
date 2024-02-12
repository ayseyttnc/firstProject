package D15ArrayList_Metodcreation.Day3_yeni;

import java.util.Scanner;

public class C02_for_loops {
    public static void main(String[] args) {
//        kullanicidan 5 sayi girmesini isteyin .
//        bu sayilardn 1 ler basamagi 7 veya 9 olanlar haric sayilarin toplamini hesaplayin
        Scanner scanner=new Scanner(System.in);

   int toplam=0;
   for (int i=0 ; i <5 ; i++) {
       System.out.println("bir sayi giriniz");
       int sayi = scanner.nextInt();
       if (sayi % 10 == 7 || sayi % 10 == 9) ;
       {
           continue;
       }

//       toplam =toplam+sayi;
   }
        System.out.println(toplam);

        System.out.println("................................");
        Scanner scanner1 = new Scanner(System.in);
        int sum = 0;

        for(int i =0; i<5; i++){

            System.out.println("Please enter a number:");
            int sayi = scanner1.nextInt();

            if(sayi%10 != 7 && sayi%10 != 9){
                sum += sayi;
            }

        }
        System.out.println(sum);


    }
}
