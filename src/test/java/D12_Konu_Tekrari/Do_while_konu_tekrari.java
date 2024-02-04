package D12_Konu_Tekrari;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Do_while_konu_tekrari {
    public static void main(String[] args) {
        int i=5;
        do {
//            System.out.println(i);
            i--;
        }while (i>2);

        int m=1;
        do {
//            System.out.println("ben while loop um");
        }while (m<1);

        Scanner scan=new Scanner(System.in);
        int counter=0;
        do {
            if (counter == 4) {
//                System.out.println("hesabiniz blokeolmustur");
                break;
            }

//            System.out.println("lutfen usurname giriniz");
            String username = scan.next();

//            System.out.println("lutfen password giriniz");
            String password = scan.next();

            if (username.equals("admin") && password.equals("pw12")) {
//                System.out.println("hesabiniza hosgeldiniz");

            }
            counter++;
        }while (true);

        String[] std1=new String[4];
        System.out.println(std1);
        System.out.println(Arrays.toString(std1));



    }
}
