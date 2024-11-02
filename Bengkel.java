import java.util.HashMap;
import java.util.Map;

public class Bengkel {
    private Map<Kendaraan, RiwayatServis> catatanServis = new HashMap<>();
    private Map<Kendaraan, Pelanggan> pemilikKendaraan = new HashMap<>();

    public void tambahKendaraan(Kendaraan kendaraan, Pelanggan pelanggan) {
        catatanServis.put(kendaraan, new RiwayatServis(kendaraan));
        pemilikKendaraan.put(kendaraan, pelanggan);
    }

    public void tambahLayanan(Kendaraan kendaraan, String layanan) {
        if (catatanServis.containsKey(kendaraan)) {
            catatanServis.get(kendaraan).tambahLayanan(layanan);
        } else {
            System.out.println("Kendaraan tidak ditemukan dalam catatan.");
        }
    }

    public void tampilkanRiwayatServis(Kendaraan kendaraan) {
        if (catatanServis.containsKey(kendaraan)) {
            catatanServis.get(kendaraan).tampilkanRiwayatServis();
            Pelanggan pemilik = pemilikKendaraan.get(kendaraan);
            System.out.println("Pemilik: " + pemilik.getNama() + ", Kontak: " + pemilik.getNomorKontak());
        } else {
            System.out.println("Kendaraan tidak ditemukan dalam catatan.");
        }
    }

    // Tambahkan metode untuk mendapatkan daftar kendaraan
    public Map<Kendaraan, RiwayatServis> getCatatanServis() {
        return catatanServis;
    }
}
