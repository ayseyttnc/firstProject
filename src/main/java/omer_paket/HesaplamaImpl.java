package omer_paket;

public class HesaplamaImpl implements IHesaplama{
    @Override
    public void seneSonuHesaplama() {
        System.out.println("IHesaplama.sirketAdi = " + IHesaplama.sirketAdi);
//        IHesaplama.sirketAdi="yeni";
    }
}
