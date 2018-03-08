
public class Tunniplaan {

    private String[] ained;
    private int[] algused;

    public Tunniplaan(String[] ained, int[] algused) {
        this.ained = ained;
        this.algused = algused;
    }
    public int annaAlgusaeg(String aine){
        for (int i = 0; i < ained.length; i++) {
            if (ained[i].equals(aine)){
                return algused[i];
            }
        }
        return -1;
    }
}
