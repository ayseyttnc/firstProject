import java.util.Scanner;

public class WhileFor {
    public static void main(String[] args) {
        System.out.println("2+3 nedir ?");
        int cevap;
        Scanner scan = new Scanner(System.in);
        cevap = scan.nextInt();
        int count = 1;
        while (cevap != 5) {
            System.out.println("cevap :" + cevap);
            System.out.println("tekrar deneyiniz");
            System.out.println("Deneme : " + count);
            cevap = scan.nextInt();
            count++;

            if (count == 3) {
                break;
            }

        }
        System.out.println(count + " defa deneme yaptiniz");
        if (cevap == 5) {
            System.out.println("tebrikler cevabiniz dogrudur");
        }else {
            System.out.println("hakkiniz bitmistir");
        }
    }
}
