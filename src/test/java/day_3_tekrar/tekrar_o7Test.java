package day_3_tekrar;

import java.util.Arrays;

class tekrar_o7Test {

    public static void main(String[] args) {

        String[][] students = {{"ali","kemal"}, {"cemal","celil"}, {"cemil","veli"}};
        for (String[] w : students) {
           // System.out.println("w = " + Arrays.toString(w));
            for (String k : w) {
          //      System.out.println("k = " + k);
                if (k.contains("m")) {

                    System.out.println(k);
                }
            }


        }
    }
}