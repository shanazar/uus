package Lõbustuspark;

import java.util.ArrayList;
import java.util.List;

public class Külastaja {
    private int vanus;
    private double kulud;
    private List<String> külastuseKirjeldused;

    public Külastaja(int vanus) {
        this.külastuseKirjeldused = new ArrayList<>();
        this.vanus = vanus;
    }

    public int getVanus() {
        return vanus;
    }

    public void lisaKirjeldus(String sisend) {
        külastuseKirjeldused.add(sisend);
    }

    public List<String> kõikKirjeldused() {
        return külastuseKirjeldused;
    }
    public void lisaKulu(double kulu){
        kulud+=kulu;
    }
    public double kuludeSumma(){
        return kulud;
    }
}
