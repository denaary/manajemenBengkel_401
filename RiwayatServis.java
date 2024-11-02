import java.util.ArrayList;
import java.util.List;

public class RiwayatServis {
    private Kendaraan kendaraan;
    private List<String> layanan;

    public RiwayatServis(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
        this.layanan = new ArrayList<>();
    }

    public void tambahLayanan(String layanan) {
        this.layanan.add(layanan);
    }

    public void tampilkanRiwayatServis() {
        System.out.println("Riwayat Servis untuk " + kendaraan.getTipe() + " (" + kendaraan.getPlatNomor() + "):");
        for (String layanan : layanan) {
            System.out.println("- " + layanan);
        }
    }
}
