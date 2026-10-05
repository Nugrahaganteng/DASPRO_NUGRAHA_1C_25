import java.util.Scanner;

public class tugas2_25 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan hari membeli buku (contoh: rabu): ");
    String hari = input.nextLine();
    System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
    String jenisBuku = input.nextLine();
    System.out.print("Masukkan jumlah buku yang dibeli: ");
    int jumlahBuku = input.nextInt();

    int diskon = 0;

    if (hari.equals("rabu")) {
      if (jenisBuku.equals("kamus")) {
        diskon = 10;
        if (jumlahBuku > 2) {
          diskon = diskon + 2;
        }
      } else {
        if (jenisBuku.equals("novel")) {
          diskon = 7;
          if (jumlahBuku > 3) {
            diskon = diskon + 2;
          } else {
            diskon = diskon + 1;
          }
        } else {
          if (jumlahBuku > 3) {
            diskon = 5;
          }
        }
      }
    }

    if (hari.equals("rabu")) {
      System.out.println("Diskon yang didapat: " + diskon + "%");
    } else {
      System.out.println("Tidak ada diskon karena promo hanya berlaku hari Rabu.");
    }
    input.close();
  }
}