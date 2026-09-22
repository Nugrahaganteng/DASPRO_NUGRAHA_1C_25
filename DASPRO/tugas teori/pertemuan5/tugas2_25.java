import java.util.Scanner;

public class tugas2_25 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan kode layanan: ");
    int kode = input.nextInt();

    switch (kode) {
      case 1:
        System.out.println("Layanan: legalisir ijazah");
        System.out.println("Loket: Loket A");
        break;
      case 2:
        System.out.println("Layanan: Surat Keterangan Aktif Kuliah");
        System.out.println("Loket: Loket B");
        break;
      case 3:
        System.out.println("Layanan: Pembayaran UKT");
        System.out.println("Loket: Loket C");
        break;
      case 4:
        System.out.println("Layanan: Pengajuan Cuti Akademik");
        System.out.println("Loket: Loket D");
        break;
      default:
        System.out.println("Kode layanan tidak valid");
    }
  }
}