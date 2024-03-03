package day07.C01;

import java.util.HashMap;
import java.util.Map;

public class Map04 {
   /*
İki farklı Arrayde aynı indekste barındırılan ad ve soyadları örnekteki gibi
yazdıran bir kod yazınız.
    input: {"John","Mark","Ali"}, {"Steinbeck","Down","Can"};
    output: {John=Steinbeck, Mark=down,Ali=Can}
 */

    public static void main(String[] args) {
        String[] isimler={"John","Mark","Ali"};
        String[] soyIsimler={"Steinbeck","Down","Can"};

        Map<String,String> tamIsim=new HashMap<>();
        for (int i = 0; i < isimler.length ; i++) {
            tamIsim.put(isimler[i],soyIsimler[i]);
        }
        System.out.println("tamIsim = " + tamIsim);
    }

}
