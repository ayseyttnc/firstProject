package day_3_tekrar;

import java.util.Arrays;

public class tekrar_o7 {
    public static void main(String[] args) {
int [] arr={0,8,0,3,4};
int[] newarr=new int[arr.length];

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newarr));

        int ilkindex=0;
        for (int w:arr){
            if(w!=0){
                newarr[ilkindex]=w;
                ilkindex++;

            }

        }
        System.out.println(Arrays.toString(newarr));


int[] a=new int[3];
a[0]=2;
a[1]=1;
a[2]=3;

int[] b=new int[3];
b[0]=2;
b[1]=1;
b[2]=3;

boolean result=Arrays.equals(a,b);
        System.out.println(result);

        System.out.println(".............................");

        String [][] students={{"ali, kemal"}, {"cemal,celil"} , {"cemil,veli"}};

        int toplam=0;
        for (String[] w:students){
            toplam=toplam+w.length;}

            System.out.println("toplam = " + toplam);

            for (String[] w:students){
                for (String k:w){
                    if (k.contains("m")){

                        System.out.println(k);
                    }
                }


        }



    }



}