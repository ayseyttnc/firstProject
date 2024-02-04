import java.util.Scanner;

public class WhileOrneklerBreakContinue {
    public static void main(String[] args) {
//        int i = 0;
//        while (i <= 100) {

//            if (i % 2 == 0) {
//                System.out.println(i);
//                i++;
//                break;
//            }



//        }
    Scanner scan=new Scanner(System.in);
    int toplam=0;
    int input;
    while (true){
        System.out.println("lutfen sayi giriniz");
        input= scan.nextInt();
        if (input<0){
            System.out.println("negative bir sayi girdiniz lutfen tekrardan deneyiniz");
            System.out.println("girilen tek sayilar toplami:"+toplam);
            break;
        }
    }

}}
