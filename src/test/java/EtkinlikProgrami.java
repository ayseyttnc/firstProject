import java.util.Scanner;

public class EtkinlikProgrami {
    public static void main(String[] args) {
        int sicaklik;
        Scanner scan=new Scanner(System.in);
        System.out.println("hava sicakligini giriniz :");
        sicaklik= scan.nextInt();

        if (sicaklik>30){
            System.out.println("yuzmeye gidilir!");
        } else if (sicaklik>5 && sicaklik<30) {
            System.out.println("sinemaya gidilir :");}
        else if (sicaklik<5) {
            System.out.println("kayak yapmaya gidilir :");}
        else {
            System.out.println("evde oturulur :");

        }

    }

    }




