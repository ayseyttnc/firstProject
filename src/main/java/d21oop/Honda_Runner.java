package d21oop;

public class Honda_Runner {
    public static void main(String[] args) {
//        A
        Honda h = new Honda();
    }}
/*Soru : Ayni class'taki constructor'lar arasinda gezinebilir miyim?
Ornegin Car class'tan hem sedan hem de sport modellerini ayni anda alip diger ortak ozelliklerle birlikte
uretime sokabilir miyim? Evet.

Cevap : Ayni class'taki constructor'lar arasinda gezinmek icin super() silinir ve this() keyword'u kullanilir.
 this() default olarak parametresiz constructor'i secer.

this() ve super() her zaman ilk satirda olmalidir.
Bu yuzden bir constructor'da ikisi bir arada kullanilamazlar.*/


/*Soru : super() keyword'u kullanilarak parent class'taki constructor'lar degil de, variable'lar ve methodlar secilebilir mi?  Evet.

Cevap : child'da bir constructor icinde, super yazip parantez koymadan, nokta koyup parent'taki variable veya methodlara ulasabiliriz */