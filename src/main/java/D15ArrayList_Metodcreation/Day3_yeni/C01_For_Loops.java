package D15ArrayList_Metodcreation.Day3_yeni;

import java.util.Scanner;

public class C01_For_Loops {
    public static void main(String[] args) {
//        kullanicidan bir kelime girdisi isteyin
//        kelimeden c harfin erstlana kadar  devam etin
//        a harflerinin sayisi hesaplansin

//        aaabaaacaa

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime =scanner.nextLine();
int sayac=0;
        for (int i=0; i<kelime.length(); i++){
            String kucukharfli=kelime.toLowerCase();
            if (kelime.charAt(i)=='c'){
break;
            }
            if (kelime.charAt(i)=='a'){
                sayac++;
            }

        }
        System.out.println(sayac);
    }

}
