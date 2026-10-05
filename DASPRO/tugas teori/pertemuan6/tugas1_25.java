
import java.util.Scanner;
public class tugas1_25 {
  public static void main(String[] args) {
    // int nilai = 85;
    // boolean hadir = true;

    // if (nilai >= 0 && nilai <= 100) {
    //   if (hadir) {
    //     if (nilai >= 75) {
    //       System.out.println("Lulus");
    //     } else {
    //       System.out.println("Tidak lulus");
    //     }
    //   } else {
    //     System.out.println("Tidak lulus karena tidak hadir");
    //   }
    // } else {
    //   System.out.println("Nilai tidak valid");
    // }

    // int total;
    // int diskon;
    // int bayar;
    // String kartu;

    // Scanner sc = new Scanner(System.in);

    // System.out.print("Apakah pelanggan mempunyai kartu anggota (y atau t)? ");
    // kartu = sc.nextLine();
    // System.out.print("Berapa total harga barang belanjaan? Rp ");
    // total = sc.nextInt();

    // if (kartu.equals("y")) {
    //   if (total > 500000) {
    //     diskon = 50000;
    //   } else {
    //     diskon = 25000;
    //   }
    // } else {
    //   if (total > 200000) {
    //     diskon = 10000;
    //   } else {
    //     diskon = 0;
    //   }
    // }

    // bayar = total - diskon;
    // System.out.println("Total yang harus dibayar: Rp " + bayar);
    // sc.close();
     Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = input.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int bil3 = input.nextInt();

        int terbesar;

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                terbesar = bil1;
            } else {
                terbesar = bil3;
            }
        } else {
            if (bil2 > bil3) {
                terbesar = bil2;
            } else {
                terbesar = bil3;
            }
        }

        System.out.println("Bilangan terbesar: " + terbesar);
        input.close();
    
  }
}