import java.util.Arrays;
public class Massiivid {
    static int[] massiivid( int[] massiiv1, int[] massiiv2){
        int[] uusmassiiv=new int[massiiv1.length+massiiv2.length];
        System.arraycopy(massiiv1,0,uusmassiiv,0,massiiv1.length);
        System.arraycopy(massiiv2,0,uusmassiiv,massiiv1.length,massiiv2.length);
        Arrays.sort(uusmassiiv);
        return uusmassiiv;
    }
    public static void main(String[] args) {
        int[] a ={1,2,3};
        int[] b={4,1,6};
        int[] uus=massiivid(a,b);
        int[] uus2=ümberpööramine(a);
        //System.out.println(Arrays.toString(uus));
        //System.out.println(Arrays.toString(uus2));
        }
    static int[] ümberpööramine( int[] massiiv) {
        int[] uusmassiiv= new int[massiiv.length];
        for (int i = massiiv.length-1; i >=0 ; i--) {
            //System.out.println(massiiv[i]);
            uusmassiiv[massiiv.length-i-1]=massiiv[i];
        }
        return uusmassiiv;
    }
    }