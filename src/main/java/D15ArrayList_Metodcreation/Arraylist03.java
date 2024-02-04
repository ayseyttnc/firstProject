package D15ArrayList_Metodcreation;

import java.util.ArrayList;
import java.util.List;

public class Arraylist03 {
    public static <character, list> void main(String[] args) {
        //Ornek 1: Tekrarli elemanlari olan bir listten, tekrarsiz elemanlari olan bir list elde ediniz.
//      [J, a, v, a, v] ==> [J, a, v]
//      [J, a, v, a, v] ==> [J, a, v]

//Bir interface, bir class'a nasıl davranması gerektiğini tanımlayan bir sözleşmedir.
// Bir class, bir interface'i implement ettiğinde, interface'deki tüm yöntemleri implement etmelidir.

//List'i kullanmak, kodunuzun daha esnek ve uyumlu olmasını sağlar.
//List tipinde bir değişken tanımladığınızda, bu değişkenin farklı List implementasyonlarını
// (örneğin ArrayList, LinkedList, Vector vb.) tutabilmesi mümkündür.





        List<Character> a=new ArrayList<>();
        a.add('j');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');
        System.out.println(a);
List<Character> b=new ArrayList<>();
for (Character w: a){
    if (!b.contains(w)) {
        b.add(w);
    }

}
        System.out.println(b);
    }
}
