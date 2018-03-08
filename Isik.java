public class Isik {

    private String nimi;
    private double pikkus;

    public Isik(String isikuNimi, double isikuPikkus) {
        nimi = isikuNimi;
        pikkus = isikuPikkus;
    }
    public String getNimi() {
        return nimi;
    }

    public Isik() {
        this("Nimetu", 0.0);
    }

    public class Tudeng extends Isik {
        private String ülikool;

        public Tudeng(String isikuNimi, double isikuPikkus) {
            super(isikuNimi, isikuPikkus);
        }

        @Override
        public String getNimi() {
            return super.getNimi();
        }

        public Tudeng() {
            super();
        }

        public Tudeng(String nimi, double pikkus, String ülikool) {
            super(nimi, pikkus);
            this.ülikool = ülikool;
        }
    }

}