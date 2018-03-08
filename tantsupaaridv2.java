import java.util.Arrays;

public class tantsupaaridv2 {
    public static void main(String[] args) {
        int[] Sisend = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            Sisend[i] = Integer.parseInt(args[i]);
        }
        int PoisteArv = Sisend[0];
        int[] poisid = Arrays.copyOfRange(Sisend, 1, PoisteArv + 1);
        int[] tydrukud = Arrays.copyOfRange(Sisend, PoisteArv + 2, Sisend.length);
        int[][] valjund = combine(poisid, tydrukud);
        for (int i = valjund.length - 1; i >= 0; i--) {
            System.out.println(valjund[i][0] + " ja " + valjund[i][1]);
        }
    }

    static int[][] combine(int[] poisid, int[] tydrukud) {
        int[][] paarideloend = new int[Math.min(poisid.length, tydrukud.length)][2];
        Arrays.sort(poisid);
        Arrays.sort(tydrukud);
        for (int i = 0; i < Math.min(poisid.length, tydrukud.length); i++) {
            paarideloend[i][0] = poisid[i];
            paarideloend[i][1] = tydrukud[i];
        }
        return paarideloend;
    }
}
