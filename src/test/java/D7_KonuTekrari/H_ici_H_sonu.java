package D7_KonuTekrari;

import java.util.Scanner;

public class H_ici_H_sonu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String gunismi;
        System.out.println("Gunismi giriniz");
        gunismi= input.next();

        boolean Haftasonu=(gunismi.equalsIgnoreCase("cumartesi"))||
                (gunismi.equalsIgnoreCase("pazar"));

        boolean Haftaici=(gunismi.equalsIgnoreCase("pazartesi")) ||
                (gunismi.equalsIgnoreCase("sali")) ||
                (gunismi.equalsIgnoreCase("carsamba"))||
                (gunismi.equalsIgnoreCase("persembe")) ||
                (gunismi.equalsIgnoreCase("cuma"));
        if (Haftasonu){
            System.out.println("haftasonu");
        } else if (Haftaici) {
            System.out.println("haftaici");

        }
        else {
            System.out.println("yanlis gun girdiniz");
        }
    }
}
