import java.util.Scanner;

public class SwitchCalis {
    public static void main(String[] args) {
     Scanner scanner= new Scanner(System.in);
        System.out.println("sayi giriniz");
int a= scanner.nextInt();
        if (a == 1) {
            System.out.println("a : 1");
        } else if (a == 2) {
            System.out.println(" a: 2");
        } else if (a == 3) {
            System.out.println(" a: 3");
        } else {
            System.out.println(" digerleri");
        }
       System.out.println("**********");
         switch (a){
            case 1: System.out.println("a : 1");
            break;
            case 2:System.out.println("a : 2 ");
            break;
            case 3:System.out.println("a : 3");
            break;
            default:System.out.println("diger");
        }

    }
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi= scan.nextInt();
        switch (sayi){
            case 1:
                System.out.println(" a:1");
                break;
            case 2:
                System.out.println("a:2");
                break;
            case 3:
                System.out.println("a:3");
                break;
            default:
                System.out.println("die");

        }

    }
}
