package D15ArrayList_Metodcreation.Day3_yeni;

import java.util.Scanner;

public class C04_while_loop {
    public static void main(String[] args) {
//        kullanicidan bir sayi girdisi isteyin
//        girilen sayidan basliyrak 10 un katina gelene kadar ardisik sekilde sayailariyazdirin
//        22  -23 24 25 26 27 28 29

        int sayi =22;
        while(sayi%10!=0){
            System.out.println(sayi+ " ");
            sayi++;
        }

    }
}
