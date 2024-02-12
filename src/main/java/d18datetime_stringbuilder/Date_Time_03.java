package d18datetime_stringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Set;

public class Date_Time_03 {
    public static void main(String[] args) {


  /*LocalTime Class'ta kullanilan tarih saat formatlari

    HH : mm ==> 24'lu saat sistemi
    hh : mm ==> 12'li saat sistemi. AM, PM gosterilmez
    hh : mm a ==> 12'li saat sistemi. AM, PM gosterilir
    HH : mm : ss ==> saniyeyi gosterir
    HH : MM ==> yanlis format cunku MM aylar icin kullanilir
    "mm" "minute" demektir. "MM" "month" demektir.

    dd-MM-yyyy ==> gun - ay - yil
    MMM ==> Aug
    MMMM ==> August  */


//Anlik zamani nasil aliriz?
//LocalTime kullanacagiz.
//LocalTime, Java’nın java.time paketinde bulunan bir Class’tir ve sadece saat bilgisini
//(saat, dakika, saniye ve milisaniye) temsil etmek için kullanılır.
//Bu sınıf, tarih bilgisini içermez ve yalnızca saatle ilgilidir.

//ornek now(): gecerli saat bilgisini alir

        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);


        //ornek 2:"DateTimeFormatter", bir Class'tir ve tarih ve saat verilerini belirli bir biçimde görüntülemek, okumak ve işlemek için kullanılan önemli bir araçtır.

//DateTimeFormatter, tarih ve saat nesnelerini "metin" yani String olarak biçimlendirmenize ve metni tarih ve saat nesnelerine çözmenize olanak tanır.

//ofPattern() metodu, belirli bir kalıba (pattern) göre tarih ve zaman verilerini biçimlendirmek için kullanılır.
//format() method'u LocalTime'i String'e istedigimiz formatta cevirir

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm a");

        String formattedtime = dtf1.format(myCurrentTime);

//    ...................
//    ornek 3 tarihi formatliaylim##

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
//        TemporalAccessor myCurrentDate;
//        String formattedDate = dtf2.format(myCurrentDate);
//System.out.println(formattedDate);

        //ornek 4: Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?

//ZoneId, zaman dilimi veya coğrafi bölge bilgisini temsil eder ve
// tarih/saat işlemlerinde bu bilginin kullanılmasını sağlar.

//    tokyo da ayin kaci

        LocalDate dateintokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateintokyo);

//        amsterdam

        LocalDate dateinamsterdm=LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateinamsterdm);

//tokyo saat

//        LocalTime timeintokyo=LocalDate.now(ZoneId(""))

        //---------------Ekstra bilgi - Zone'lar

//---------------Ekstra bilgi - Zone'lar
//        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
//
//        for (String zoneId : zoneIds){
//            System.out.println(zoneId);
//        }
//        System.out.println("Toplam zaman dilimi sayisi: " + zoneIds.size());

//ornek 5: Tarih ve zamani ayni anda kullanalim.
//LocalDateTime, tarih ve saatlerle çalışmak için kullanılır.

        LocalDateTime ldyt=LocalDateTime.now();
        System.out.println(ldyt);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd * MMM * yyyy - hh : mm a");
        String formattedLdt = dtf3.format(ldyt);
        System.out.println(formattedLdt);

    }




}
