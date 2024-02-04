package D11_Konu_tekrari_new;

import java.util.Scanner;

public class Loop_tekrar01 {
    public static void main(String[] args) {
        double num=28.578;
        String snum=String.valueOf(num);
        String decialpart=snum.split("\\.")[1];

        int intdecimalpart=Integer.valueOf(decialpart);

        int sum=0;
        for (int i = intdecimalpart; i >0; i=i/10) {
            sum=sum+i%10;
            System.out.print("sum :" + sum);

        }

        System.out.println(".............");

        int sum1=0;
        for (int i = 6; i <11 ; i++) {
            sum1=sum1+i;


        }
        System.out.println("sum1 = " + sum1);

        System.out.println("...............");


        Scanner scan=new Scanner(System.in);
        System.out.println("satir sayilarini girini");
//        int satir= scan.nextInt()
//        System.out.println("sutun sayilarini giriniz");
//        int sutun=

    }

}
