package D10_loops;

public class For_loop01 {
    public static void main(String[] args) {
/*Ornek 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
==> "Tramvay"==> "Tr"
*/

        //charAt() methoduna index verince size karakteri getirir
//car tek karakter tek tirnak
//break anahtar kelimesi, bir döngüyü veya bir switch ifadesini erken bir şekilde sonlandırmak için kullanılır.
        String s = "tramvay";
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a') {
                break;


            }

            System.out.println(s.charAt(i));
        }
        //Ornek 2: Verilen bir String’de kucuk harfleri console’a yazdirmayan kodu yaziniz
//“Pwd12?Ab” ==> P12?A
//        continue /islem yapma, donguye devam et, geri kalan kodlari yurutme, artirma azaltmaya git
        System.out.println(".....................");
        String s1 = "Pwd12?Ab";
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (ch >= 'a' && ch <= 'z') {


            } else {
                System.out.print(ch);

            }


        }
        System.out.println("..............");

//ornek 3: Verilen bir String'i tersden yazan kodu yaziniz
//           String t = "Ali Can";  ==> "naC ilA"
//Loop olustururken baslangic ve bitis degeri cok onemlidir
//ters =ters+t.substring(i,i+1) calisir
//son index her zaman length()-1'tir
        String t = "java";
        String ters = "";
        for (int i = t.length() - 1; i >= 0; i--) {
            ters = ters + t.charAt(i);

        }
        System.out.println(ters);

    }
}
