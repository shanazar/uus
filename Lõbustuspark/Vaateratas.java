package Lõbustuspark;

import Lõbustuspark.Lõbustus;

public class Vaateratas implements Lõbustus {
    public void lõbusta(Külastaja külastaja) {
        külastaja.lisaKirjeldus("külastasin vaateratast");
    }
}
