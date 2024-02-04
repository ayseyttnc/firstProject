package D14_Array_Arraylist;

public class M_D_03 {
    public static void main(String[] args) {
//        /Ornek 1: int turunde bir Multidimensional Array’deki en kucuk ve en buyuk elemanin toplamini bulunuz.
  int [][] ages={{15,4},{12,43,21}};
  int enkucuk=ages[0][0];
  int enbuyuk=ages[0][0];

  for (int[] w: ages){
      for (int k:w){
          enkucuk= Math.min(enkucuk,k);
          enbuyuk=Math.max(enbuyuk,k);

      }
  }
        System.out.println(enbuyuk);
        System.out.println(enkucuk);
        System.out.println(enbuyuk+enkucuk);


    }
}
