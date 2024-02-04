package D8_String_manipulations;

public class String_manipulastion04 {
    public static void main(String[] args) {
        //Ornek 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
//String tv = “$456.99”;  String laptop = “$875.99"; ==> 456.99 + 875.99 = 1332.98
//        valueof()= belirtilen stringi  double cevirir

        String tv = "$456.99";
        String laptop = "$875.99";

        tv = tv.replace("$", "");
        laptop = laptop.replace("$", "");

//        double totalprice=double.valueof(tv) + double.valueof(laptop);
//        System.out.println(totalprice);


//...................

        //Ornek 2: Kullanici isminin ilk harflerini alip buyuterek console’a yazdiriniz.
//      ”  ali cAN  ” ==> AC
        //trim() metodu bir String’deki bastaki ve sondaki bosluklari siler. Aradakileri silmez
//split() String’i istediginiz karakterden parcalamaya yarar.
//        tekli karakter aldigi icin char
//        trim bosluklarikapatir
//        split

        String name = "   ali   cAN   ";
        System.out.println("name.trim() = " + name.trim());
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println("first = " + first);
//        char at 0 ile neden c aldik


        char last = name.trim().toUpperCase().split("\\s+")[1].charAt(2);
        System.out.println("last = " + last);

        System.out.println(first + last);
//char bir sayisal turu .ali can arasinaki bosluga trim mudahale etmez.split birdn fazla boslukta excepsion a duser
// cozumu \\s+ bir veya daha fazla ardisik bosluk karakterini ifade eder

        String money = "$4  $5  $6  $7";
        System.out.println("money.split(\",\")[2] = " + money.split(" ")[2]);
        System.out.println("money.split(\",\")[2] = " + money.split("\\s")[2]);

        String name2 = "omer";
        System.out.println("name2.charAt(0) = " + name2.charAt(0));
    }

}
