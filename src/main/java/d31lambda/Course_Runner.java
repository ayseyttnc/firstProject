package d31lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Course_Runner {
    public static void main(String[] args) {
        //course class in paramtreli constructer ini kullanarak 4 tane obje olusturalim

        Course courseTurkishDay = new Course("summer", "turkish day", 97, 128);
        Course courseTurkishNight = new Course("winter", "turkish night", 98, 154);
        Course courseEnglishDay = new Course("spring", "english day", 95, 132);
        Course courseEnglishNight = new Course("winter", "english night", 93, 144);

        List<Course> courseLIst = new ArrayList<>();
        courseLIst.add(courseTurkishDay);
        courseLIst.add(courseTurkishNight);
        courseLIst.add(courseEnglishDay);
        courseLIst.add(courseEnglishNight);

       // System.out.println(courseLIst);

///1)Tum “averageScore” larin 91’den buyuk olup olmadigini kontrol eden kodu yaziniz

//allMatch metodu, akıştaki (stream) tüm öğelerin belirli bir koşulu karşılayıp karşılamadığını
// kontrol eder. Eğer akıştaki tüm öğeler bu koşulu sağlarsa true döndürür,
// aksi takdirde false döndürür.(VE gibi)

        boolean result1= courseLIst.stream().allMatch(t -> t.getAverageScore()>81);

        System.out.println(result1);


        //2)Tum kurslardaki ögrenci sayilarinin 100’den buyuk olup olmadigini kontrol eden kodu yaziniz
        boolean result2= courseLIst.stream().allMatch(t -> t.getNumberOfStudent()>100);
        System.out.println(result2); //true

      //  /3)Kurs isimlerinden en az birinin “Turkish” kelimesini icerip icermedigini kontrol eden kodu yaziniz.

        //anyMatch,Akıştaki herhangi bir elemanın belirli bir koşulu karşılayıp karşılamadığını kontrol eder.
//Eğer akıştaki elemanlardan en az biri koşulu karşılıyorsa true döndürür, yoksa false döndürür.(VEYA gibi)

        boolean result3=courseLIst.stream().anyMatch(t -> t.getCourseName().contains("turkish"));
        System.out.println(result3);

        System.out.println("------------------------");

//4) Sezon isimlerinden en az birinin "Summer" kelimesini icerip icermedigini kontrol eden kodu yaziniz.

boolean result4=courseLIst.stream().anyMatch(t -> t.getSeason().contains("summer"));

        System.out.println(result4);

//5) Kurs donemleri icinde “Fall” doneminin hic bulunmadigini kontrol eden kodu yaziniz.

        boolean result5=courseLIst.stream().noneMatch(t -> t.getSeason().contains("fall"));

        System.out.println(result5);

//6) Kurs isimleri icinde “German” isminin hic bulunmadigini kontrol eden kodu yaziniz.

        boolean result6=courseLIst.stream().noneMatch(t -> t.getCourseName().contains("german"));

        System.out.println(result6);

    //7)Average score’u en yuksek olan kursun ismini console yazdiran kodu yaziniz.
        System.out.println("********************************");

        courseLIst.stream()
                .sorted(Comparator.comparingInt(Course::getAverageScore).reversed())
                .limit(1)
                .forEach(t-> System.out.println(t.getCourseName()));






    }
    //7)Average score’u en yuksek olan kursun ismini console yazdiran kodu yaziniz.

    //a) sorted, Stream içerisindeki elemanları doğal sıralamasına göre sıralar.(kucukten buyuge)
//Özel bir sıralama için bir Comparator’da alabilir.
//b) Comparator.comparing, belirli bir özelliğe göre elemanları sıralamak için bir Comparator oluşturur.
//c) reversed, Bir Comparator’ın sıralama sırasını tersine çevirir.
//d) findFirst, Stream’deki ilk elemanı döndüren bir Optional döner.
}










