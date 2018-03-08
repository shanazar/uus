package Lõbustuspark;

import java.util.Arrays;
import java.util.List;

public class Lõbustuspark {
    private List<Lõbustus> lõbustused;

    public Lõbustuspark(List<Lõbustus> lõbustused) {
        this.lõbustused = lõbustused;
    }

    public void alustaSeiklust(Külastaja külastaja) {
        System.out.println("alustan seiklust");
        for (Lõbustus i :lõbustused){
            i.lõbusta(külastaja);
        }
        List<String> kirjeldused=külastaja.kõikKirjeldused();
        for (String kirjeldus :kirjeldused){
            System.out.println(kirjeldus);
        }
        System.out.println(külastaja.kuludeSumma());
    }
}
