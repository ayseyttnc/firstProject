public class karsilastirmaOperatorleri {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        boolean sonuc = (a > b);
        System.out.println(sonuc);





        int c = 3;
        int d = 5;
        int e = 12;
        boolean kosul1= (c<d);
        boolean kosul2=(d<e);
        boolean sonuc2= (kosul1 && kosul2);
        boolean sonuc3=(c<d) &&(d<e);
        System.out.println(sonuc2);
        System.out.println(sonuc3);


}}
