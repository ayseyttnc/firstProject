package D6;

import java.util.Scanner;

public class D6Konutekrari {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("ayse yazdi");
        String Dayname;
        System.out.println("dayname giriniz");
        System.out.println("bu omer branchinda");
        Dayname= scan.nextLine();

        if (Dayname.equalsIgnoreCase("sunday")) {
            System.out.println(1);
        } else if (Dayname.equalsIgnoreCase("monday")) {
            System.out.println(2);

        } else if (Dayname.equalsIgnoreCase("tuesday")) {
            System.out.println(3);

        } else if (Dayname.equalsIgnoreCase("wednesday")) {
            System.out.println(4);

        } else if (Dayname.equalsIgnoreCase("tuersday")) {
            System.out.println(5);

        } else if (Dayname.equalsIgnoreCase("friday")) {
            System.out.println(6);

        } else if (Dayname.equalsIgnoreCase("saturday")) {
            System.out.println(7);

        } else {
            System.out.println("yanlis gun girdiniz");

        }
//        switch (Dayname){
//            case "sunday":
//                System.out.println(1);
//
//        }switch (Dayname){
//            case "monday":
//                System.out.println(2);
//
//        }switch (Dayname){
//            case "tuesday":
//                System.out.println(3);
//
//        }switch (Dayname){
//            case "wednesday":
//                System.out.println(4);
//
//        }switch (Dayname){
//            case "tuersday":
//                System.out.println(5);
//
//        }switch (Dayname){
//            case "friday":
//                System.out.println(6);
//
//        }switch (Dayname){
//            case "saturday":
//                System.out.println(7);
//
//            default:
//                System.out.println("yanlis gun girdiniz");
//        }


    }
}
