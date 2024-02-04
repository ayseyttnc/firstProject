package d9String_loops;

public class newString_manipulation02 {
    public static void main(String[] args) {
        //lastIndexOf() method’u spesifik bir karakterin son gorunumunun index’ini verir
//Bu method olmayan karakterler icin -1 verir

//        6:18
//Ornek 1: Bir String’deki tekrarsiz character’leri ekrana yan yana yazdiriniz.
// yusuf ==> ysf
//01234
//indexof("u")==>1 u lar birbirinden farkli ve tekrarliyor
//        lastindexof("u")==>3
//        index("y")==>0 ikisi birbirine esit tekrarsiz
//        lastindexof("Y")==>0

        String s="yusuf";

        if(s.indexOf("y")==  s.lastIndexOf("y")){
            System.out.print("y");
        }
        if(s.indexOf("u")==  s.lastIndexOf("u")){
            System.out.print("u");

        } if(s.indexOf("s")==  s.lastIndexOf("s")){
            System.out.print("s");

        } if(s.indexOf("f")==  s.lastIndexOf("f")){
            System.out.print("f");
        }

        System.out.println();
///Ornek 2: Bir banka kartının son 4 hanesi hariç tüm hanelerini '*' kullanarak görünmez yapın
//           1234 6789 1234 6789 ==> **** **** **** 6789

        String cardnum= "1234 6789 1234 6789";
        String first=cardnum.substring(0,15).replaceAll("[0-9]","*");
        System.out.println("first = " + first);

        String last=cardnum.substring(15);
        System.out.println("last = " + last);

        String result=first+last;
        System.out.println("result = " + result);
//String result2=first.concat(last)
//        result2.System.out.println("result2 = " + result2);
    }
}
