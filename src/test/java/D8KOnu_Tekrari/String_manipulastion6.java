package D8KOnu_Tekrari;

import java.util.Scanner;

public class String_manipulastion6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen sifrenizi giriniz");
        String password = input.nextLine();

        boolean lenghtControl = password.length() > 7;
        System.out.println("lenghtControl = " + lenghtControl);

        boolean spaceControl = password.replaceAll("[^ ]", "").length() == 0;
        System.out.println("spaceControl = " + spaceControl);

        boolean toupperCase = password.replaceAll("^[A-Z]", "").length() > 0;
        System.out.println("toupperCase = " + toupperCase);

        boolean tolowersCase = password.replaceAll("[a-z]", "").length() > 0;
        System.out.println("tolowersCase = " + tolowersCase);

        boolean rakam = password.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("rakam = " + rakam);


//....................... odev............

      boolean sembol=password.replaceAll("^[\\p{Punct}]" , "").length()>0;
        System.out.println("sembol = " + sembol);

        boolean isvalid=lenghtControl&&spaceControl&&tolowersCase&&toupperCase&&sembol;
        if (sembol){
            System.out.println("sifre gecerlidir");

        }
        else {
            System.out.println("sifre gcersizdir");
        }


    }
}
