package D12_Konu_Tekrari;

import java.util.Scanner;

public class while_loop02_tekrar {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("carpim taplosunu giriniz");
        int num= input.nextInt();

        int k=1;
        while (k<11){
            System.out.println(num+ "x"+ k +"="+num*k);
            k++;
        }
        //Ornek 1:  Belirli bir tamsayının palindrome olup olmadığını kontrol eden kodu yazın.
//      Palindrome: 121 <==> 121    123321 <==> 123321

        int j=313;
        String m=String.valueOf(j);
        String reversed="";

        int n=m.length()-1;

        while (n>=0){
            reversed=reversed+m.charAt(n);
            n--;
        }
        System.out.println(reversed);
        if (m.equals(reversed)){
            System.out.println("polidromdur");

        }else {
            System.out.println("polindiromdegildir");
        }

    }
}
