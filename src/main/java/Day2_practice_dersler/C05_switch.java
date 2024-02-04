package Day2_practice_dersler;

import java.util.Scanner;

public class C05_switch {
    public static void main(String[] args) {
/*

        Kullanıcıdan 0-4 arasında bir puan girdisi isteyin.

        Eğer ki puanı,
            0,0 - 1,0 arasinda ise: KALDI yaziniz.
            1,0 - 2,0 arasinda ise: GECTI yaziniz.
            2,0 - 2,5 arasinda ise: IYI yaziniz.
            2,5 - 3,5 arasinda ise: UST yaziniz.
            3,5 - 4,0 arasinda ise: HARIKA yaziniz.

        Devaminda,

        Switch Case kullanarak harf notlari veriniz.
            KALDI   = F
            GECTI   = D
            IYI     = C
            UST     = B
            HARIKA  = A


 */
        Scanner scan=new Scanner(System.in);
        System.out.println("puaninizi yaziniz");
        double puan= scan.nextDouble();
String seviye="";
        if (puan>=0 && puan<1){
            seviye="kaldi";
        } else if (puan>=1&&puan<2) {
            seviye="gecti";
        }
        else if (puan>=2 &&puan<2.5) {
            seviye="iyi";
        }
        else if (puan>=2.5 &&puan<3.5) {
            seviye="ust";
        }else if (puan>=3.5 &&puan<=4) {
            seviye="harika";
        }else {
            seviye="gecersiz";
        }
        System.out.println("seviye = " + seviye);

        switch (seviye){
            case"kaldi":
                System.out.println("f");
                break;
            case"gecti":
                System.out.println("d");
                break;
            case"iyi":
                System.out.println("c");
                break;
            case"ust":
                System.out.println("b");
                break;
            case"harika":
                System.out.println("a");
                break;
            default:
                System.out.println("gecerli bir not giriniz");
        }
    }

}
