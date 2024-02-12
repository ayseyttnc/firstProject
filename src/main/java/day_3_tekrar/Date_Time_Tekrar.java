package day_3_tekrar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Date_Time_Tekrar {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen verilen sirada dogum tarihinizi alt alta giriniz ");
        int y= scan.nextInt();
        int m= scan.nextInt();
        int d= scan.nextInt();

        LocalDate date=LocalDate.of(y,m,d);
        System.out.print(date.getDayOfYear());
        System.out.println(".....................");

        LocalDateTime lydt=LocalDateTime.now();
        System.out.println(lydt);

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd*MMM*yyy - hh: mm a");
    String formattedldt= dtf3.format(lydt);
        System.out.println(formattedldt);
    }
}
