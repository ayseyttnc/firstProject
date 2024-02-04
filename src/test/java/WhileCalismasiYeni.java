import java.util.Scanner;

public class WhileCalismasiYeni {
    public static void main(String[] args) {
        /**
         *  girdigimiz degerler positif olacak
         * sadece tek sayilari alacaiz
         * ve bu sayilari toplayacagiz
         *
         *
         */

        int input;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        input = scanner.nextInt();

        while (true) {

            if (input < 0) {
                break;
            }
            if (input % 2 == 1) {
                count += input;
            }
//            System.out.println("bir sayi giriniz");
//            input = scanner.nextInt();
        }
        System.out.println("count = " + count);

    }
}
