public class Motor extends Kendaraan {
    public Motor(String platNomor, String merek) {
        super(platNomor, merek);
    }

    @Override
    public String getTipe() {
        return "Motor";
    }
}
