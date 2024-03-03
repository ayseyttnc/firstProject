package biletRezervasyonApp;

public class Ticket {
    //4.mesafe(km),

    public double distance;
    public int typeNo;
    public String seatNo;
    public double price;

    //5.bilet fiyatini hesaplayalim
    public  void azragetTotalPrice(int age) {
        int seat = Integer.parseInt(this.seatNo);
        double total = 0;
        switch (this.typeNo) {
            case 1:
                if (seat % 3 == 0) {
                    total = this.distance * 1.2;

                } else {
                    total = this.distance * 1;
                }
                System.out.println("toplam tutar :" + total);
                break;

            case 2: //cift yon
                if (seat % 3 == 0) {
                    total = this.distance * 2.4;
                } else {
                    total = this.distance * 2;
                }
                System.out.println("toplam tutar:" + total);

                //cift yon indirimi

                total = total * 0.8;//80

                break;

        }//son tutardan yas indirmi
        if (age <= 12) {
            total = total * 0.5;
            System.out.println("12 yas alti indirimli total fiyat");
        } else if (age >= 65) {
            total = total * 0.7;
            System.out.println("65 yas ustu indirimli total fiyat");
        }

        this.price = total;
        //6.bilati yazdiralim

//        public void printTicke
//         (Bus otobus){
        System.out.println(";;; bilet detayi ;;;;");
           System.out.println("otobus olakasi:" );
        System.out.println("mesafe:" + this.distance);
        System.out.println("yolculuk tipi" + this.typeNo);
        System.out.println("koltuk no:" + this.seatNo);
        System.out.println("toplaam tutar" + this.price);
        System.out.println("keyifli yolcular dileriz");
    }

        }


