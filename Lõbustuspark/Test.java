package Lõbustuspark;

import Lõbustuspark.Lõbustuspark;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Vaateratas uusvaateratas = new Vaateratas();
        Külastaja uuskülastaja = new Külastaja( 9);
        Külastaja uuskülastaja1 = new Külastaja( 11);
        Kloun kloun = new Kloun("David Hasselhof");
        LõbustavKloun lõbuskloun = new LõbustavKloun(kloun);
        Lasketiir uuslasketiir = new Lasketiir();
        TasulineLõbustus vaaterattaisend= new TasulineLõbustus(2.25,uusvaateratas);
        TasulineLõbustus lasketiiruisend= new TasulineLõbustus(1.5,uuslasketiir);
        VanuseKontrollija kontrollija = new VanuseKontrollija(10,lasketiiruisend);
        Lõbustuspark uuslõbustuspark = new Lõbustuspark(List.of(uusvaateratas, kontrollija, lõbuskloun));
        //Kui delegeeritaks vastupidi TasulineLõbustus-->Vanusekontrollija, siis isik lihtsalt ei pääse
        //lasketiiru sõltumata vanusest
        uuslõbustuspark.alustaSeiklust(uuskülastaja);
        uuslõbustuspark.alustaSeiklust(uuskülastaja1);
    }
}
