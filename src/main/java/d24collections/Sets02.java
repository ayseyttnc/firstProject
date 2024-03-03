package d24collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {
        //Interview Sorusu
//Ornek 1 : Ogrenci email adreslerini natural order’da siralanmis olarak depolayiniz.

        long t1=System.nanoTime();


//1.yol yavas - Treeset- cunku her elemanda siralama yapar
        TreeSet<String> emails=new TreeSet<>();
        emails.add("k@gmail.com");
        emails.add("a@gmail.com");
        emails.add("z@gmail.com");
        emails.add("l@gmail.com");
        emails.add("u@gmail.com");
        emails.add("p@gmail.com");
        emails.add("g@gmail.com");
        emails.add("b@gmail.com");
        emails.add("t@gmail.com");
        emails.add("x@gmail.com");
        System.out.println(emails);
long t2=System.nanoTime();
//        2.yol tavsiye edilir daha hizli
//        elemanlari eklerken en hizli olandan yardim  alalim hash set den

        HashSet<String> emailshs=new HashSet<>();
        emailshs.add("k@gmail.com");
        emailshs.add("a@gmail.com");
        emailshs.add("z@gmail.com");
        emailshs.add("l@gmail.com");
        emailshs.add("u@gmail.com");
        emailshs.add("p@gmail.com");
        emailshs.add("g@gmail.com");
        emailshs.add("b@gmail.com");
        emailshs.add("t@gmail.com");
        emailshs.add("x@gmail.com");

//bos bir tree set olusturalim ve constructor a hasshset i yazalim

        TreeSet<String> emailshsts=new TreeSet<>(emailshs);
        System.out.println(emailshsts);

long t3=System.nanoTime();
//tree set hizi
        System.out.println(t2-t1);
//        hashset hizi
        System.out.println(t3-t2);








    }
}
