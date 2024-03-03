package proje;

public class Depo {
    private static int id = 1000;
    private String urunIsmi;
    private String uretici;
    private int miktar = 0;
    private String birim;
    private String raf = null;


    public int urunTanimlama(String urunIsmi,String uretici,String birim) {
        this.urunIsmi=urunIsmi;
        this.uretici=uretici;
        this.birim=birim;
        id++;
return id;
    }
}