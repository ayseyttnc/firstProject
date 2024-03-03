package kayitDosyasi;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTask {
    @Test
    public void test1(){
        Map<Integer,KayitBilgileri>map=new HashMap<>();
        KayitBilgileri ogrenci1=new KayitBilgileri("omer1","ali",37,6);
        KayitBilgileri ogrenci2=new KayitBilgileri("omer2","ali",37,2);
        KayitBilgileri ogrenci3=new KayitBilgileri("omer3","ali",37,1);
        KayitBilgileri ogrenci4=new KayitBilgileri("omer4","ali",37,4);
        KayitBilgileri ogrenci5=new KayitBilgileri("omer5","ali",37,6);
        KayitBilgileri ogrenci6=new KayitBilgileri("omer6","ali",37,5);
        map.put(1,ogrenci1);
        map.put(2,ogrenci2);
        map.put(3,ogrenci3);
        map.put(4,ogrenci4);
        map.put(5,ogrenci5);
        map.put(6,ogrenci6);

        System.out.println("map = " + map.get(3).getGrade());
    }
}
