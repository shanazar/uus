public class Tantsupaar {
    private String poisiNimi;
    private int poisiAasta;
    private String tüdrukuNimi;
    private int tüdrukuAasta;

    public Tantsupaar(String poisiNimi, int poisiAasta, String tüdrukuNimi, int tüdrukuAasta) {
        this.poisiNimi = poisiNimi;
        this.poisiAasta = poisiAasta;
        this.tüdrukuNimi = tüdrukuNimi;
        this.tüdrukuAasta = tüdrukuAasta;
    }

    public int vanemAasta(int aasta) {
        if (poisiAasta > tüdrukuAasta) {
            return aasta - poisiAasta;
        } else {
            return aasta - tüdrukuAasta;
        }
    }

    public boolean samaAasta() {
        if (tüdrukuAasta == poisiAasta) {
            return true;
        } else {
            return false;
        }
    }

    public String perekonnnaNimed() {
        String poisiPerenimi = poisiNimi.split(" ")[1];
        String tüdrukuPerenimi = tüdrukuNimi.split(" ")[1];
        return poisiPerenimi + " " + tüdrukuPerenimi;
    }

    @Override
    public String toString() {
        return perekonnnaNimed();
    }

    public String getPoisiNimi() {
        return poisiNimi;
    }

    public void setPoisiNimi(String poisiNimi) {
        poisiNimi = poisiNimi;
    }

    public int getPoisiAasta() {
        return poisiAasta;
    }

    public void setPoisiAasta(int poisiAasta) {
        poisiAasta = poisiAasta;
    }

    public String getTüdrukuNimi() {
        return tüdrukuNimi;
    }

    public void setTüdrukuNimi(String tüdrukuNimi) {
        tüdrukuNimi = tüdrukuNimi;
    }

    public int getTüdrukuAasta() {
        return tüdrukuAasta;
    }

    public void setTüdrukuAasta(int tüdrukuAasta) {
        tüdrukuAasta = tüdrukuAasta;
    }

}
