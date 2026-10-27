import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah produk: ");
        int jumlahProduk = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = sc.nextInt();

        int totalSemua = 0;
        int p = 1;


        while (p <= jumlahProduk) {
            int totalProduk = 0;
            System.out.println("\n--- Produk " + p + " ---");
   
            for (int h = 1; h <= jumlahHari; h++) {
                int jumlahTerjual;
                do {
                    System.out.print("Masukkan terjual hari ke-" + h + ": ");
                    jumlahTerjual = sc.nextInt();
                    if (jumlahTerjual < 0) {
                        System.out.println("Jumlah terjual tidak boleh negatif! Silakan ulangi.");
                    }
                } while (jumlahTerjual < 0);
                
                totalProduk += jumlahTerjual;
            }

            double rataRata = (double) totalProduk / jumlahHari;
            System.out.println("Total produk " + p + " = " + totalProduk);
            System.out.println("Rata-rata harian produk " + p + " = " + rataRata);
            
            totalSemua += totalProduk;
            p++;
        }

        System.out.println("\n=================================");
        System.out.println("Total seluruh produk = " + totalSemua);
    }
}