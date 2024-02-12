package d18datetime_stringbuilder;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class Date_Time_01 {
    public static void main(String[] args) {
//ornek 1: Kullanicidan aldiginiz tarih gecmise ait ise “Gecersiz tarih girdiniz” mesaji veriniz.
//Kullanicidan aldiginiz tarih gelecege ait ise “Zamani girebilirsiniz” deyiniz.

        Scanner input=new Scanner(System.in);
        LocalDate girilentarih=null;

        while (true){

            System.out.println("lutfen yilimgiriniz:");
            int year=input.nextInt();

            System.out.println("lutfen ayi giriniz:");
//            kullanicidan ay bilgisini aldik
            int month= input.nextInt();

            if (month<1 || month>12){
                System.out.println("ay 1 ile 12 arasinda olmalidir ,lutfen tekrar deneyiz");
                continue;
//               continiou kullaniciyi dongunun basina yonlendirir

            }
            System.out.println("lutfen gunu giriniz");
            int day= input.nextInt();

//            o ayin kac cektini bulmak icin girilen yil ve ay icin yearMonth objesi olusturlaim

            YearMonth yearmonth=YearMonth.of(year,month);

//            o ayin maxx gun sayisini hesaplayim

            int daysinmont=yearmonth.lengthOfMonth();

            if (day<1 || day> daysinmont ){
                System.out.println("girilen ay icin gecersiz gun .lutfen tekrar deneyiniz");
               continue;
            }

girilentarih=LocalDate.of(year,month,day);

            if (girilentarih.isBefore(LocalDate.now())){
                System.out.println("gecersiz bir tarih girdiniz");



            }else {
                System.out.println("zamani girebilirsiniz");
//                gecerli tarih girdiniz donguden cik donguyu kirdi
                break;
            }


        }

    }
}
