import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class CiftSayiTekSyi {
    @Test
    public  void test() {
        int sayi;
        int count = 0;
        Scanner scan=new Scanner(System.in);
        while (true){
            System.out.println("lutfen sayi giriniz");
            sayi= scan.nextInt();
            if (sayi%2==0){
                System.out.println(sayi+sayi);
                break;

            }
           tekMiyim(sayi);
        }

    }

    public void tekMiyim(int sayi){

        if (sayi%2==1){
            System.out.println("tek sayi girdiniz lutfen cift sayi giriniz");
        }

    }
}
