package day_6;

public class Co2_StringBuilduir {
    public static void main(String[] args) {
        /*

        - Kapasitesi 7 olan bir StringBuilder objesi oluşturun.
        - Capacity ve Length değerlerini yazdırın.
        - Bu objeye "hava güzel" verisini ekleyin ve yazdırın.
        - Aradaki boşluğu siliniz.
        - Veriyi ters çeviriniz.
        - Verinin son 4 karakterini siliniz.
        - Veriyi tekrar ters çevirin.
        - Verinin başına "Java " verisini ekleyin.

 */
        StringBuilder sb=new StringBuilder(7);
        System.out.println("sb.capacity() = " + sb.capacity());
        System.out.println("sb.length() = " + sb.length());

        sb.append("hava guzel");
        System.out.println(sb);
//     -- - Aradaki boşluğu siliniz.

int boslukindex= sb.indexOf(" ");
sb.deleteCharAt(boslukindex);
        System.out.println(sb);

//        - Veriyi ters çeviriniz.

sb.reverse();
        System.out.println(sb);

//   - Verinin son 4 karakterini siliniz.

sb.delete(sb.length()-4,sb.length());
        System.out.println(sb);

//        - Veriyi tekrar ters çevirin.
sb.reverse();
        System.out.println(sb);

        System.out.println("sb.capacity() = " + sb.capacity());
        System.out.println("sb.length() = " + sb.length());

//        - Verinin başına "Java " verisini ekleyin.

sb.insert(0,"java  ");
        System.out.println(sb);
    }
}
