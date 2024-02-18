package d7_switch_turnary_string;

import org.testng.annotations.Test;

import javax.swing.text.Utilities;

public class Turnary01 {
    public static void main(String[] args) {


        //Ornek 1: Bir sayinin mutlak degerini hesaplayan kodu yaziniz.

//-4 ==> -1*-4, 4 ==> 4, 0 ==> 0
//    (c)?(t):(f)
        int c = -4;
//    condition?true : false
        int result = c < 0 ? -1 * c : c;
        System.out.println(result);

//    /Ornek 2: Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise
// “Farkli isaretli sayilari carpamiyorum” mesaji veren
        int a = -4;
        int b = -7;
       Object sonuc=( (a>0 && b>0) || ( a<0 && b<0)) ? a*b: "frkli isaetli sayilari carpmiyorum";
//    object javada non=primitive data type larin ortak parent idir
        System.out.println(sonuc);

// int a=5;
// int b=3;
// b=++a;
        System.out.println(""+(a  + b));
    }

}
