package d27exceptions;

public class Eo3 {
    public static void main(String[] args) {


        //3) StringIndexOutOfBoundsException, bir String nesnesinin karakter dizisindeki
// geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.


        String s="java";

    //    karakterSec(s,2);
        karakterSec(s,5);

    }//main disi

    public static void karakterSec(String s,int idx){
        try {
            char ch=  s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {

            System.err.println("olmayan indexleri kullanmayiniz : "+ e.getMessage());
e.printStackTrace();//developer hatalari gormek isters kullanir.exceptioni kullanir ama exception firlatmaz
// ,kodlar alttan calismaya devm eder
        }
        System.out.println("app calisiyor");

    }
}
