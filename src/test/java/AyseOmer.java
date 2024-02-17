import org.junit.jupiter.api.Test;

public class AyseOmer {

    int[][] array={{2,3,4},{1,2,3,4,5},{4,7},{6}};
    @Test
    void test1() {
        int carpim=1;
        int toplam=0;
        for (int i = 0; i < array.length ; i++) {
            int lastindex=( array[i][array[i].length - 1]);
            carpim*=lastindex;
            toplam+=lastindex;


        }
    }
}