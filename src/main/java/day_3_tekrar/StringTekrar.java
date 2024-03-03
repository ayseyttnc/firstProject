package day_3_tekrar;

public class StringTekrar {
    public static void main(String[] args) {
        String s = "Learn";
        String t = "Java";
//        Hangisi yanlıştır?
         System.out.println((s.concat(t)).length());
//        Ekrana 9 yazdırır
                 System.out.println("" + s.length() + t.length());
//        Ekrana 9 yazdırır
                 System.out.println(s.concat(String.valueOf(t.length())));
//        Ekrana Learn4 yazdırır
        System.out.println(s.length() >s.charAt(2));

    }
}
