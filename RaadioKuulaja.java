import java.util.ArrayList;
import java.util.Arrays;

public class RaadioKuulaja {
    String[] raadiosaated= new String[0];
    public void kuula(String raadiosaade) {
        String[] uuslist = new String[raadiosaated.length + 1];
        uuslist = Arrays.copyOfRange(raadiosaated, 1, raadiosaated.length+1);
        uuslist[0]=raadiosaade;
        raadiosaated=uuslist;
    }

    public String[] meenuta(){
        return raadiosaated;
    }
}
