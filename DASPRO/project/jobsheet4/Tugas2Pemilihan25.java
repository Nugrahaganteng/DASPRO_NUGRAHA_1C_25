import java.util.Scanner;

public class  Tugas2Pemilihan25 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int jumlahSks;

    System.out.print("Masukkan jumlah SKS: ");
    jumlahSks = scanner.nextInt();

    if (jumlahSks > 24) {
      System.out.println("Melebihi batas");
    } else {
      System.out.println("KRS valid");
    }

    scanner.close();
  }
}