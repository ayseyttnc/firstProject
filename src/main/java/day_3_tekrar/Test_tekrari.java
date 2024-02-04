package day_3_tekrar;

public class Test_tekrari {
    public static void main(String[] args) {
        int input = 5;
        for (int j = 1; j <= input; j++) {


            for (int i = 1; i <= input; i++) {
                System.out.print(i*j);
            }
            System.out.println();
        }
    }
}
