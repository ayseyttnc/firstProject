package d28exceptions_enum_iterators;

public class E02 {
    public static void main(String[] args) {


        int a = 12;
        int b = 1;
        int[] c = {3, 5, 7, 9};
        getir(c, a, b);
    }//main disi

    public static void getir(int[] c, int a, int b) {
        try {
            int idx = a / b;
            int element = c[idx];
            System.out.println(element);
        } finally {//bu kisim yukarda hata olsada calisir olmasada calisir
            System.out.println("database ile baglantiyi kesiniz");
        }
        System.out.println("merhaba");// bu kisim catch vara her zaman calsir catch yoksa ecx calismaz

// Coklu finally block kullanilamaz
//java da try + bir catch, try + birden fazla catch, try + catch + finally,
// try + finally kullanilabilir.


    }
}