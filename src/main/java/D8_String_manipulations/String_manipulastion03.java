package D8_String_manipulations;

import java.util.Scanner;

public class String_manipulastion03 {
    public static void main(String[] args) {
        /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

i)En az 8 karakter olsun
ii)Space karakteri password'de olmasin
iii)En az bir tane buyuk harf olsun
iv)En az bir tane kucuk harf olsun
v)En az bir tane rakam olsun */

        Scanner input =new Scanner(System.in);
        System.out.println("lutfen sifrenizi giriniz");
        String pwd= input.nextLine();
       boolean lengthcontrol= pwd.length() >7 ;
//        System.out.println("lengthcontrol = " + lengthcontrol);
//         bir kere bosluga basmak space haric demek
//        /lenght yerine . isempty() de olabilir

     boolean spaceControl=   pwd.replaceAll("[^ ]" , "").length()==0;
//        System.out.println("spaceControl = " + spaceControl);

        boolean upperCaseControl =pwd.replaceAll("[^A-Z]" , "").length()>0;
//        System.out.println("upperCaseControl = " + upperCaseControl);


        boolean lowerCaseControl=pwd.replaceAll("[^a-z]","").length()>0;
//        System.out.println("lowerCaseControl = " + lowerCaseControl);


        boolean rkm=pwd.replaceAll("[^0-9]" , "").length()>0;
//        System.out.println("rkm = " + rkm);
//
//        / en az bir tane sembol icermeli odev

        boolean isvalid= lengthcontrol&&spaceControl&&upperCaseControl&&rkm;
        if (isvalid){
            System.out.println("sifre gecerli");
        }
        else {
            System.out.println("sifre gecersizdir");

        }
        if (rkm){
            System.out.println("sifre en az bir rakam icermelidir");
        }

    }
}
