package sigorta;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Sigorta {
    public static void main(String[] args) {
        startSigorta();
    }

    private static void startSigorta() {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen araba turunu giriniz");
        String arabaturu= scan.nextLine();
        System.out.println("lutfen donem giriniz: 1 veya 2");
        int donem= scan.nextInt();

        if (donem==1 || donem==2){
            ArabaTuru araba=new ArabaTuru();


            araba.setDonem(donem);
            araba.setArabaTuru(arabaturu);
            araba.hesaplama();
            if (araba.getFiyat()>0){
                System.out.println(
                        "arabanizin modeli : "+arabaturu+
                                "arabanizin donemi : "+donem+
                                "arabanizin fiyati : "+araba.getFiyat()

                );
            }else{
                System.out.println("fiyatiniz  yanlistir");

            }
        }else{
            System.out.println("doneminiz yanlistir");
        }

    }

    @Test
    public void test(){

        int index=1;
        int donem=1;
        int fiyat=(donem==index)?1500:2000;






    }

}
