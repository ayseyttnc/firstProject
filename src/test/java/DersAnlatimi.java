import java.util.Scanner;

public class DersAnlatimi {
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("yasinizi giriniz");
        age = input.nextInt();

        //String sonuc =(age <= 50) ? "gencsiniz " : "yaslisiniz";
        //System.out.println(sonuc);
        if (age <= 50) {
            String sonuc = "gencsiniz";
            System.out.println(sonuc);

        } else {
            String sonuc = "yaslisiniz";
            System.out.println(sonuc);


        }
    }
}
