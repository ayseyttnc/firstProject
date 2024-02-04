package D8KOnu_Tekrari;

import org.junit.jupiter.api.Test;

public class String_Manipulastion07 {
    public static void main(String[] args) {
        String tv = "45$6.7$5$";
        String laptop = "$547.67";
        String karisik = "sdfghjhgSDFGHGF345654.,";
        String fiyat = "£5.6";

        tv = tv.replaceAll("[^$.]", "");
        System.out.println("tv = " + tv);

        laptop = laptop.replace("$", "");
        System.out.println("laptop = " + laptop);

        karisik = karisik.replaceAll("[\\p{Punct}]", "");
        System.out.println("karisik = " + karisik);

        Double totalprice = Double.valueOf(tv) + Double.valueOf(laptop);

        System.out.println("totalprice = " + totalprice);

        String name = "  aLi  cAN  ";

        System.out.println("..............");

        String money = "$4 $5 $6 ";
        System.out.println("money.split(\",\")[2]=" + money.split(",")[2]);
        System.out.println("money.split(\",\")[2]=" + money.split("\\s")[2]);


        String a = "abc@gamil.com";
        System.out.println(a.substring(4, 9));

        String company = a.split("@")[1].split("\\.")[0];
        System.out.println("company = " + company);

        int startingindex = a.indexOf(".");
        int endingindex = a.indexOf("@");
        System.out.println("endingindex = " + endingindex);
        System.out.println("startingindex = " + startingindex);

        String companyName = a.substring(startingindex, endingindex);
        System.out.println("companyName = " + companyName);


    }
}


