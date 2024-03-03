package day_3_tekrar;

import java.util.HashSet;
import java.util.TreeSet;

public class Set_02tekrar{
    public static void main(String[] args) {
        //Ornek 1 : Ogrenci email adreslerini natural order’da siralanmis olarak depolayiniz.

        TreeSet<String> emails=new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("c@gmail.com");
        emails.add("f@gmail.com");
        emails.add("e@gmail.com");
        emails.add("b@gmail.com");
        emails.add("m@gmail.com");
        System.out.println(emails);

        HashSet<String> emailshs=new HashSet<>();
        emailshs.add("a@gmail.com");
        emailshs.add("c@gmail.com");
        emailshs.add("f@gmail.com");
        emailshs.add("e@gmail.com");
        emailshs.add("b@gmail.com");
        emailshs.add("m@gmail.com");

     TreeSet<String> emailshts=new TreeSet<>(emailshs);
        System.out.println("emailshts = " + emailshts);


    }

}