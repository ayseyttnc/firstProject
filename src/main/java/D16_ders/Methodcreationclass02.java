package D16_ders;

public class Methodcreationclass02 {
    public static void main(String[] args) {
        int sonuc1 = carpma(3, 5);
        System.out.println(sonuc1);

//        orenk 2 calistirma
        int sonuc2 = carptopla(4, 4, 2);
        System.out.println("sonuc2 = " + sonuc2);
//ornek 3
        yaz("ali can");

    }

//main disi

//    iki sayiyi carpan bir metod olusturunuz
///protected: Bu class'tan erisilebilir.
//Bir de sadece miras alinan class'lardan erisilebilir(extends)

    protected static int carpma(int a, int b) {
        return a * b;
    }
    //private : Buraya sadece ayni class icerisinden erisilebilir.
//Diger class'lar erisemez
    //ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method olusturunuz

    private static int carptopla(int a, int b, int c) {
        return a * b + c;
    }

//ornek 3: Girilen bir kelimeyi konsola yazdiran bir method olusturunuz (void yani return yok)
//Eger bir method yeni bir data uretmiyor ise return type’i void olur
//void ise return yazilmaz

    public static void yaz(String str) {
        System.out.println(str);
    }


}