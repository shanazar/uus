public class Elektriauto {
    private String automark;
    private double elektrikulu;
    private int sõiduulatus;
    private int laadimisaeg;
    private Elektrijaam elektrijaam;
    public double elektrihind;

    public Elektriauto(String automark, double elektrikulu, int sõiduulatus, int laadimisaeg, Elektrijaam elektrijaam) {
        this.automark = automark;
        this.elektrikulu = elektrikulu;
        this.sõiduulatus = sõiduulatus;
        this.laadimisaeg = laadimisaeg;
        this.elektrijaam = elektrijaam;
    }

    public int getLaadimisaeg() {
        return laadimisaeg;
    }

    public Elektrijaam getElektrijaam() {
        return elektrijaam;
    }

    public void setLaadimisaeg(int laadimisaeg) {
        if (laadimisaeg >= 0) {
            this.laadimisaeg = laadimisaeg;
        }
        else {
            System.out.println("Vigane laadimisaeg");
        }

    }
    public double maskumus100(){
        return this.elektrikulu*this.elektrihind;
    }
    public double maksumus(int teepikkus){
        return this.maskumus100()*teepikkus/100;
    }
    public double reisiKestus(int teepikkus,double keskmineKiirus){
        return (double) (teepikkus/this.sõiduulatus)*this.laadimisaeg+teepikkus/keskmineKiirus;
    }

    public String toString() {
        return "Elektriauto{" +
                "automark='" + automark + '\'' +
                ", elektrikulu=" + elektrikulu +
                ", sõiduulatus=" + sõiduulatus +
                ", laadimisaeg=" + laadimisaeg +
                ", elektrijaam=" + elektrijaam +
                ", elektrihind=" + elektrihind +
                '}';
    }
}
