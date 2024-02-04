package D11_Konu_tekrari_Loops;

import org.junit.jupiter.api.Test;

public class Loops_2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 578; i > 0; i /= 10) {
            sum = sum + i % 10;
        }
        //  System.out.println("sum = " + sum);

        String t = "yusuf";
        String unique = "";

        for (int i = 0; i < t.length(); i++) {
            String ch = String.valueOf(t.charAt(i));

            System.out.println("ch = " + ch);
            System.out.println("unique = " + unique);
            System.out.println("****************");
            if (!unique.contains(ch)) {
                unique = unique + ch;
            } else {
                unique = unique.replace(ch, "");
            }
        }
        System.out.println("tekrarsiz:" + unique);

        System.out.println("..................");
//        /Ornek 2: 23'den 12'ye kadar cift tamsayilari console'a yazdiriniz(12 dahil)

        int k = 23;
        for (k = 23; k > 11; k--) {
            if (k % 2 == 0) {
                System.out.print(k + " ");
            }
        }

int a=23;
        while (a>=12) {
            if (a % 2 == 0) {
                System.out.println(a);
            }

a--;

        }


    }
}
