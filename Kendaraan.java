public abstract class Kendaraan {
    private String platNomor;
    private String merek;

    public Kendaraan(String platNomor, String merek) {
        this.platNomor = platNomor;
        this.merek = merek;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public String getMerek() {
        return merek;
    }

    public abstract String getTipe();
}
