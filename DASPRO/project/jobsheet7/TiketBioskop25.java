import java.util.Scanner;

public class TiketBioskop25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlah;
        int totalTiket = 0;
        int totalPenjualan = 0;

        System.out.println("=== Penjualan Tiket Bioskop ===");
        System.out.println("(masukkan 0 jika sudah tidak ada pelanggan)");

        while (true) {
            System.out.print("Jumlah tiket yang dibeli: ");
            jumlah = sc.nextInt();

            if (jumlah < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi!");
                continue;
            }
            
            if (jumlah == 0) {
                break;
            }

            int harga = jumlah * hargaTiket;
            int diskon = 0;
            if (jumlah > 10) {
                diskon = 15;
            } else if (jumlah > 4) {
                diskon = 10;
            }

            int bayar = harga - (harga * diskon / 100);
            System.out.println("Diskon: " + diskon + "%");
            System.out.println("Total bayar: Rp " + bayar);

            totalTiket += jumlah;
            totalPenjualan += bayar;
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);
        sc.close();
    }
}