import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        int quiz, vize;
        double ortalama;
        String name;
        String sonuc;

        Scanner input = new Scanner(System.in);

        System.out.println("adinizi giriniz");
        name = input.nextLine();

        System.out.println("quiz notunu girermisin");
        quiz = input.nextInt();
        System.out.println("vize notunu girermisin");
        vize = input.nextInt();

        ortalama = (quiz + vize) / 2;
      //  sonuc = (ortalama >= 51) ? "gectiniz" : "kaldiniz";  ternary operation
        if (ortalama>= 51){
            sonuc="Gectiniz";
        } else {
            sonuc="kaldiniz";
        }


        System.out.println("sayin " + name + "\t ortalamaniz : " + ortalama + "sonucgjgjhghgjh " + sonuc);

    }
}
