package day5;

import java.util.Scanner;

public class C04_FahrenheitToCelcius {
    public static void main(String[] args) {
//        // Fahrenheit'ı, Celcius'a çeviren kodu yazınız.
//// Formül: Celcius = (Fahrenheit - 32) / 1.8
//        Scanner scan=new Scanner(System.in);
//        double fah=scan.nextDouble();
//        double cel=(fah - 32) / 1.8;
//        System.out.println("celcius degeri"+ cel);

        Scanner scanner=new Scanner(System.in);
        double fah=scanner.nextDouble();
//        System.out.println(fahrenheitToCelcius(fah));
        double cel=fahrenheitToCelcius(fah);
        System.out.println(cel);

    }

        public static double fahrenheitToCelcius(double fah){
            return (fah - 32)/1.8;
        }


}
