package d7_switch_turnary_string;

public class turnary03 {
    public static void main(String[] args) {
        //Ornek 1: Verilen yilin “Leap Year” olup olmadigini kontrol eden kodu yaziniz.
        /*
               1) Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
               2) Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
 */

//  (c) ?( t): (f)
        int year = 2025;
        String result = (year % 100 == 0) ? ((year % 400 == 0) ? ("leap year") : (" leap yer degil")) : ((year % 4 == 0) ? ("leap year") : ("leap year degil"));
        System.out.println(result);

        System.out.println("----------");

        //Ornek 2: "s" String'inde ilk ve son index'teki karakterleri aliniz.
//charAt(int index) metodu, belirtilen index'te yer alan karakteri döndürmek için kullanılır.
//Indeks 0 tabanlıdır, yani ilk karakterin indeksi 0'dır, ikinci karakterin indeksi 1, ve böyle devam eder.
//Java'da indexleme, genellikle diziler (arrays), dizeler (Strings) veya koleksiyonlar (collections)
// gibi bir veri yapısındaki belirli bir elemana erişmek için kullanılan bir tekniktir.

        String name= "ayseOmer";
        System.out.println("name.charAt(0) = " + name.charAt(0));
        System.out.println("name.charAt(1) = " + name.charAt(1));
        System.out.println("name.charAt(2) = " + name.charAt(2));
        System.out.println("name.charAt(3) = " + name.charAt(3));
        System.out.println("name.length() = " + name.length());
        System.out.println("name.length() = " + (name.length()-1));
        System.out.println("name.charAt( (name.length()-1)) = " + name.charAt((name.length() - 1)));
//        char firstChar= s.charAt(0);
//        System.out.println(firstChar);
//        char lastChar= s.charAt(11);
    }
}
