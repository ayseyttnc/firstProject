package day_3_tekrar;

import java.util.Scanner;

public class DersTekrar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir ay ismi giriniz");
        int ay;
        ay=scanner.nextInt();

        switch (ay){
            case 1:
                System.out.println("ocak");
            case 2:
                System.out.println("subat");
            case 3:
                System.out.println("mart");
            case 4:
                System.out.println("nisan");
            case 5:
                System.out.println("mayis");
                break;
            default:
                System.out.println("gecerli bir ay ismi giriniz");
        }
    }

}
