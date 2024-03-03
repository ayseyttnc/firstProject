package d28exceptions_enum_iterators;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {

    public static void main(String[] args) {

        //Cities c = new Cities(); HATA.ENUM'dan object uretilemez

        //1- Enum daki bir sabite nasil ulasabiliriz?

        Cities il = Cities.GİRESUN;
        System.out.println(il); //GİRESUN sabitine ulastik

        //2- BURSA sabitinin ismine ulasalim
        String ilIsmi = Cities.BURSA.getCityName();
        System.out.println(ilIsmi); //Bursa

        //3- Ankara'nin posta koduna ulasalim
        String postaKodu = Cities.ANKARA.getPostaCode();
        System.out.println(postaKodu); //06000

        //4- Karabuk'un plaka koduna ulasalim

        System.out.println(Cities.KARABÜK.getPlateCode());
//5- Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen plaka kodunu giriniz");
        int plaka = input.nextInt();

        //values() methodu enum icindeki tum datalari bir array icinde bize verir

        Cities[] sehirler = Cities.values();
        System.out.println(Arrays.toString(sehirler));

        if (plaka < 1 || plaka > 81) {
            System.out.println("lutfen 1 ile 81 arasi bir plaka kodu giriniz");
        } else {
            for (Cities w : sehirler) {
                if (plaka == w.getPlateCode()) {
                    System.out.println("girmis oldugunuz plaka " + w.getCityName() + "  iline aittir");
                    break;
                }
            }
        }
    }
}

