package day_3_tekrar;

public class Tekrar_10 {
    public static void main(String[] args) {

        int[][] tablo=new int[][]{
                {1,2,5},{5,12,45},{54,34,1}
        };
        int[][] tablo2= new int[5][3];
        tablo2[0][0]=1;
        tablo2[0][1]=3;
        tablo2[0][2]=10;

        for (int i = 0; i < tablo.length ; i++) {
            for (int j = 0; j < tablo[0].length; j++) {
                System.out.print(tablo[i][j]+ " ");
            }
            System.out.println();
        }
        for (int[] sutun:tablo){
            for (int value:sutun){
                System.out.print(value+ " ");
            }
            System.out.println( );
        }
    }
}
