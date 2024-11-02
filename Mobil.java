public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String platNomor, String merek, int jumlahPintu) {
        super(platNomor, merek);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    @Override
    public String getTipe() {
        return "Mobil";
    }
}
