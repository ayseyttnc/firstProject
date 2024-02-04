public class CountinueDongusu {
    public static void main(String[] args) {
        for (int k=1; k<=15; k++){
            if (k==4 || k==9){
                System.out.println("------:"+ k);
                continue;
            }
            System.out.println(k);
        }



    }
}
