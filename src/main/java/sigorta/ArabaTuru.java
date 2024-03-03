package sigorta;

import java.util.Scanner;

public class ArabaTuru {

    private String arabaTuru;
    private int fiyat;
    private int donem;

    public void hesaplama() {
        switch (this.arabaTuru) {

            case "otobus":
                if (donem == 1) {
                    this.fiyat = 1000;

                } else {
                    this.fiyat = 2000;
                }
                break;


            case "tir":
                this.fiyat = (this.donem == 1) ? 1500 : 3000;
                break;

            case "motor":
                this.fiyat = (this.donem == 1) ? 2000 : 4000;
                break;

            case "ucak":
                ucakHesaplama();
                break;
            default:
                System.out.println("arac turunuz yanlistir");
                this.fiyat = 0;
        }

    }

    private void ucakHesaplama() {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen ucak turunu seciniz: tip1 icin 1 , tip2 icin 2");
        int tip = input.nextInt();

        switch (this.donem) {
            case 1 -> this.fiyat = (tip == 1) ? 2500 : 3500;
            case 2 -> this.fiyat = (tip == 1) ? 4500 : 5500;
            default -> {
                System.out.println("donemi yanlis girdiniz");
                this.fiyat = 0;
            }
        }
    }

    public void setArabaTuru(String arabaTuru) {
        this.arabaTuru = arabaTuru;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setDonem(int donem) {
        this.donem = donem;
    }
}
