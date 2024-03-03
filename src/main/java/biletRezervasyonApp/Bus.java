package biletRezervasyonApp;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    //2.plaka koltuk no
    public String numberplate;
    public List<String>seats=new ArrayList<>();
    public Bus(String plaka) {
       this.numberplate=plaka;
        for (int i = 1; i < 33; i++) {
            this.seats.add(String.valueOf(i));
        }
    }
}
