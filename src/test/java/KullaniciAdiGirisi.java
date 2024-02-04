import java.util.Scanner;

public class KullaniciAdiGirisi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String k_adi, parola;
        System.out.println("kullanici adini gririniz:");
        k_adi = scan.nextLine();
        System.out.println("parolayi giriniz:");
        parola = scan.nextLine();
        if (k_adi.equals("java") && parola.equals("123")) {
            System.out.println("basarili bir sekilde giris yaptiniz");

        } else if (k_adi.equals("java") || parola.equals("123")) {
            System.out.println("ku_adi veya parola yanlis");
        } else
            System.out.println("");

    }
}