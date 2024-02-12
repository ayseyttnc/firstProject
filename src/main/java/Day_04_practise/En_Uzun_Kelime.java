package Day_04_practise;

public class En_Uzun_Kelime {
    public static void main(String[] args) {
        /*

        Kullanıcıdan alınan cümledeki en uzun kelimeyi yazdiran bir kod yazınız.

        Ornek: "kullanicidan alinan cumle"

 */

        String cumle= "kullanicidan alinan???? cumle";
//        cumle=cumle.replaceall(regex",.?").replacement:"");
//        regex i sor

        String []kelimeler=cumle.split("");


        String enUzunKelime = kelimeler[0];

        for (String w: kelimeler) {

            if (w.length()>enUzunKelime.length()) {

                enUzunKelime= w;
            }
        }

        System.out.println(enUzunKelime);
    }
}


