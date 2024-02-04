import java.awt.*;

public class Operatorler {
    public static void main(String[] args) {

     int a=4;
     int b=7;
     int toplam= a+b ;
     int cikatrma= b-a;
     int bolme= a/b;
     int carpma= a*b;
     int mod = a%b;
     System.out.println("toplam:"+ toplam);
     System.out.println("cikartma:" + cikatrma);
     System.out.println("bolme:" + bolme);
     System.out.println("carpma:" + carpma);
     System.out.println("mod:" + mod);
     toplam ++;
     System.out.println(toplam);
     cikatrma --;
     System.out.println(cikatrma);
     int sonuc = a++ + b--;
     System.out.println(sonuc);
     System.out.println(a);
     System.out.println(b-a);

     int sayi1=3;
     int sayi2=4;

     boolean kosul = (sayi1 / sayi2)  != 0;
     System.out.println(kosul);
     boolean kosul1=(sayi1>sayi2);
     System.out.println(kosul1);
     boolean kosul2=(sayi1==sayi2);
     System.out.println(kosul2);
     boolean Sonuc= kosul1 && kosul2 ;
     System.out.println(Sonuc);
     boolean sonuc2= kosul1 ||kosul2 ;
     System.out.println(sonuc2);
     boolean Sonuc1 = ! kosul1 && kosul2;
     System.out.println("Sonuc1 = " + Sonuc1);
     String sonuc3 =(a==b) ? "Dogru" : "yanlis" ;
     System.out.println(sonuc3);

     sayi1 = sayi2 ;
     System.out.println(sayi2);
    }
}
