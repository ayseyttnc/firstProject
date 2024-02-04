import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int sayi1, sayi2, secim;
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi 1:  ");
        sayi1 = scan.nextInt();
        System.out.println("sayi 2:  ");
        sayi2 = scan.nextInt();
        System.out.println("1 toplama:\n2 cikarma:\n3 carpma:\n4 bolme:");
        System.out.println("secim:");
        secim= scan.nextInt();
        switch (secim){
            case 1-> System.out.println("toplama: "+ (sayi1+sayi2));
            case  2-> System.out.println("cikarma: "+ (sayi1-sayi2));
            case 3-> System.out.println("carpma: "+(sayi1*sayi2));
            case 4-> System.out.println("bolme:"+ (sayi1/sayi2));
            default -> System.out.println("seciminiz");

        }

    }
}
