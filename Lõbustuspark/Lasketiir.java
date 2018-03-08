package Lõbustuspark;

import Lõbustuspark.Lõbustus;

public class Lasketiir implements Lõbustus {
    public void lõbusta(Külastaja külastaja){
        int täisarv=(int)Math.round(Math.random()*20);
        külastaja.lisaKirjeldus("tabasin lasketiirus "+täisarv+" sihtmärki");
    }
}