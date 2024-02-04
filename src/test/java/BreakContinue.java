import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        int sayi;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi == 0) {
                break;

            }
            System.out.println(sayi);
        }
    }
}


