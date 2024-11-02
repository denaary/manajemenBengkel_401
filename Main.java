import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bengkel bengkel = new Bengkel();

        while (true) {
            System.out.println("Menu Bengkel");
            System.out.println("1. Tambah Kendaraan");
            System.out.println("2. Keluar");
            System.out.print("Masukkan Pilihan : ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 0) {
                break;
            }

            System.out.print("Masukkan Tipe Kendaraan (Mobil/Motor): ");
            String tipe = scanner.nextLine();

            System.out.print("Masukkan Plat Nomor: ");
            String platNomor = scanner.nextLine();

            System.out.print("Masukkan Merek: ");
            String merek = scanner.nextLine();

            Kendaraan kendaraan = null;

            if (tipe.equalsIgnoreCase("Mobil")) {
                System.out.print("Masukkan Jumlah Pintu: ");
                int jumlahPintu = scanner.nextInt();
                scanner.nextLine();
                kendaraan = new Mobil(platNomor, merek, jumlahPintu);
            } else if (tipe.equalsIgnoreCase("Motor")) {
                kendaraan = new Motor(platNomor, merek);
            } else {
                System.out.println("Tipe kendaraan tidak valid.");
                continue;
            }

            System.out.print("Masukkan Nama Pelanggan: ");
            String namaPelanggan = scanner.nextLine();

            System.out.print("Masukkan Nomor Kontak Pelanggan: ");
            String nomorKontak = scanner.nextLine();
            Pelanggan pelanggan = new Pelanggan(namaPelanggan, nomorKontak);

            bengkel.tambahKendaraan(kendaraan, pelanggan);

            System.out.print("Masukkan Layanan yang Diberikan: ");
            String layanan = scanner.nextLine();
            bengkel.tambahLayanan(kendaraan, layanan);


            System.out.println("\nInformasi Kendaraan dan Pelanggan:");
            System.out.println("Tipe Kendaraan: " + tipe);
            System.out.println("Plat Nomor: " + platNomor);
            System.out.println("Merek Kendaraan: " + merek);
            if (kendaraan instanceof Mobil) {
                System.out.println("Jumlah Pintu: " + ((Mobil) kendaraan).getJumlahPintu());
            }
            System.out.println("Nama Pelanggan: " + namaPelanggan);
            System.out.println("Nomor Kontak Pelanggan: " + nomorKontak);
            System.out.println("Layanan yang Diberikan: " + layanan);
            System.out.println("------------------------------------------");
        }

        System.out.println("Menampilkan riwayat servis:");
        for (Kendaraan k : bengkel.getCatatanServis().keySet()) {
            bengkel.tampilkanRiwayatServis(k);
            System.out.println("------------------------------------------");
        }

        scanner.close();
    }
}

