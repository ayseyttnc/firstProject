package d18datetime_stringbuilder;

import java.time.LocalDate;
import java.util.Scanner;

public class Date_Time_o2 {
    public static void main(String[] args) {
        //ornek 1: Kullanicidan aldiginiz tarih gecmise ait ise “Gecersiz tarih girdiniz” mesaji veriniz.
//Kullanicidan aldiginiz tarih gelecege ait ise “Zamani girebilirsiniz” deyiniz.
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen verilen sirada dogum tarihinizi alt alta giriniz .yil-ay-gun");
   int y= scanner.nextInt();
   int m= scanner.nextInt();
   int d= scanner.nextInt();

        LocalDate date=LocalDate.of(y,m,d);
        System.out.println(date.getDayOfYear());


    }
}
