package d17passbyvalue_constructors_datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {


//    date data tipi
        //LocalDate java.time paketinde yer alan bir classtir.
//Bu sınıf, tarih bilgilerini temsil etmek ve işlemek için kullanılır.
//Java'da java.time.LocalDate class'i, yerel tarihleri temsil etmek için kullanılır
// ve saat bilgisini içermez, yani sadece gün, ay ve yıl bilgilerini içerir.

//---------------
//ornek 1: now(): Geçerli tarihi alır. Tarih bilgisini yerel bilgisayarınızın saatinden alır,
// yani sizin bilgisayarınızın saatinden gelir
//now static bir methoddur
        LocalDate mydate=LocalDate.now();
        System.out.println(mydate);

        //ornek 2 : getMonthValue(): Tarihin ayını (1-12 arasında) alır.
//getMonth(): Bu metod ayı dondurur. (Month enum türünde)

//Java'da Month veri türü, bir enum (enumeration) türüdür (numaralandırma türüdür).
//Degisme ihtimali olmayan datalari depolamak icin kullanilir. Haftanin gun isimleri, Ay isimleri gibi

        System.out.println(mydate.getMonthValue());

        Month ay=mydate.getMonth();
        System.out.println(ay);
        //ornek 3: getYear(): Tarihin yılını alır.

        System.out.println(mydate.getYear());
        System.out.println(mydate.getDayOfYear());
//V//ornek 4:getDayOfMonth(): Ayin gününü alır.
//---------------
//ornek 4:getDayOfMonth(): Ayin gününü alır.
        int gun = mydate.getDayOfMonth();
        System.out.println(gun); //6

     DayOfWeek gun2= mydate.getDayOfWeek();
        System.out.println(gun2);

//ornek 5:
//ileriki tarihe nasil gidilir?
//plusDays(): Belirtilen gün sayısını tarihe ekler ve yeni bir LocalDate döndürür.
//plusMonths(): Belirtilen ay sayısını tarihe ekler ve yeni bir LocalDate döndürür.
//plusYears(): Belirtilen yil sayısını tarihe ekler ve yeni bir LocalDate döndürür.
//Bu methodlar, orijinalleri değiştirmez, yeni bir gun, ay ve tarih nesnesi oluşturur.


        LocalDate newDate=mydate.plusYears(1).plusMonths(2).plusDays(4);

        System.out.println(newDate);

//---------------
/*ornek 6:Gecmis tarihe nasil gidilir?
minusYears(): Bir LocalDate veya LocalDateTime nesnesinden belirtilen yıl sayısını çıkarır.
minusMonths() : Bir LocalDate veya LocalDateTime nesnesinden belirtilen ay sayısını çıkarır.
minusDays() : Bir LocalDate veya LocalDateTime nesnesinden belirtilen gün sayısını çıkarır.
Sonuç olarak, çıkarma işleminden sonra elde edilen tarihi döndürürler.*/

        System.out.println(mydate.minusYears(1).minusMonths(15).minusDays(1));


//ornek 7: Specific bir tarih objesi nasil olusturulur?

//of(int year, int month, int dayOfMonth): Belirtilen yıl, ay ve günle bir LocalDate örneği oluşturur.

        LocalDate date1=LocalDate.of(1980,8,3);
        LocalDate date2 = LocalDate.of(2010,5,4);

        System.out.println("date1 ="+date1+ ", date2 ="+date2);

        //isAfter(): Bir tarihin başka bir tarihten sonra olup olmadığını kontrol eder.boolean verir
//isBefore(): Bir tarihin başka bir tarihten once olup olmadığını kontrol eder.boolean verir

boolean sonrami= date1.isAfter(date2);
        System.out.println(sonrami);

        boolean oncemi=date1.isBefore(date2);
        System.out.println(oncemi);

        //--------------
//ornek 8: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
//Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen verilen sirada tarih bilgisini alt alta giriniz");
        System.out.println("lutfen yili giriniz");
        int year=input.nextInt();
        System.out.println("lutfen ayi giriniz");
        int month= input.nextInt();
        System.out.println("lutfen gunu giriniz");
        int day=input.nextInt();

//Kullanicidan alinan verilerle bir tarih olusturalim

        LocalDate girilenlerin=LocalDate.of(year,month,day);

        if (girilenlerin.isBefore(LocalDate.now())){

        }else {
            System.out.println("zamani girebilirsiniz");
        }













    }
}
