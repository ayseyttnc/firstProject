package D12_loop_arays;

import java.util.Scanner;

public class do_While_loops_02 {
    public static void main(String[] args) {
        /*Ornek 1:
       Gecerli Username="admin" ve Password="pwd123" dur.
       Kullanicidan username ve password'u alin.
       Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
       Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin.
       Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz.
//*/
//        sonsuz dongu olusturduk icerden kirilmadigi surece calisacak
        Scanner scan=new Scanner(System.in);

        int counter = 0;
        do {
            if (counter==4){
                System.out.println("hesabiniz bole olmustur");
                break;
            }
            System.out.println("lutfen usurname giriniz");
            String username= scan.next();

            System.out.println("lutfen password giriniz");
            String password= scan.next();

            if (username.equals("admin")&& password.equals("pwd12")){
            System.out.println("hesabiniza hosgeldiniz");
            break;
            }
            counter++;
        }while (true);

    }
}
