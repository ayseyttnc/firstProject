import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class TeksayiCiftsayi {
    //public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int a;
//        System.out.println("lutfen sayi giriniz");
//        a= scan.nextInt();
//
//        if (a%2==0){
//            System.out.println("sayi cift sayidir.");
//        }
//        else {
//            System.out.println("sayi tek sayidir.");
//        }
//
//        System.out.println("**************");
//    Scanner scan = new Scanner(System.in);
//    String ilkHarf;
//            System.out.println("bir harf giriniz");
//            ilkHarf= scan.nextLine();
//            switch (ilkHarf){
//                case "m":
//                    System.out.println("monday");
//                    break;
//                case "t":
//                    System.out.println("tuesday,thursday");
//                    break;
//
//                case"w":
//                    System.out.println("wednesday");
//                    break;
//                case "f":
//                    System.out.println("friday");
//                    break;
//                case"s":
//
//                    System.out.println("sunday,saturday");
//                    break;
//                default:
//                    System.out.println("gecersiz gun girdiniz");
//            }

  //  }
  public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String gun;
        System.out.println("bir isgunmi giriniz");
        gun= scan.nextLine();

        switch (gun){

            case "monday":
                System.out.println("haftaici");
                break;

            case "tuesday":
                System.out.println("haftaici");
                break;

            case "wednesday":
                System.out.println("haftaici");
                break;

            case "thurday":
                System.out.println("haftaici");
                break;

            case "friday":
                System.out.println("haftaici");
                break;

            case "saturday":
                System.out.println("haftasonu");
                break;

            case "sunday":
                System.out.println("haftasonu");
                break;

            default:
                System.out.println("yanlis gun girdiniz");
        }


    }




}
