import java.util.Scanner;

public class Gunler {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("bir sayi giriniz: ");
        int number = input.nextInt();
        if(number%2==0){
            System.out.println("sayimiz cift");
        }else {
            System.out.println("sayimiz tek");
        }

        Scanner obje=new Scanner(System.in);
        System.out.println("konsola sayi gir");


        int weather= obje.nextInt();

        if(weather >10){
            System.out.println("hava sicakmis");
        }else if (weather<0) {
            System.out.println("donuyorum");
        }else{
            System.out.println("hava sogukmus");
        }

           String day="sunday&&saturday";
           if(day== "monday" || day=="tuesday" || day =="wednesday" || day=="thursday" || day=="friday")
        {
            System.out.println("hafta iciymis");



        } else if (day== "saturday" && day=="sunday") {

               System.out.println("hafta sonuymus");

           } else {
               System.out.println("kusura bakmayin yanlismis");

        }

    }

}
