import java.util.Scanner;

public class tugas3_25 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan merek sepatu: ");
    String merek = input.nextLine();
    System.out.print("Masukkan kategori: ");
    String kategori = input.nextLine();
    System.out.print("Masukkan ukuran sepatu: ");
    int ukuran = Integer.parseInt(input.nextLine());

    String harga = "Data sepatu tidak tersedia";

    if (merek.equalsIgnoreCase("Converse")) {
      if (kategori.equalsIgnoreCase("Slip On")) {
        if (ukuran >= 36) {
          if (ukuran <= 40) {
            harga = "Rp800.000";
          }
        }
      } else if (kategori.equalsIgnoreCase("High Top")) {
        if (ukuran >= 40) {
          if (ukuran <= 44) {
            harga = "Rp1.200.000";
          }
        }
      }
    } else if (merek.equalsIgnoreCase("Sketcher")) {
      if (kategori.equalsIgnoreCase("Woman")) {
        if (ukuran >= 36) {
          if (ukuran <= 41) {
            harga = "Rp1.000.000";
          }
        }
      } else if (kategori.equalsIgnoreCase("Man")) {
        if (ukuran >= 41) {
          if (ukuran <= 44) {
            harga = "Rp1.800.000";
          }
        }
      }
    } else if (merek.equalsIgnoreCase("Nike")) {
      if (kategori.equalsIgnoreCase("Kids")) {
        if (ukuran >= 36) {
          if (ukuran <= 40) {
            harga = "Rp750.000";
          }
        }
      } else if (kategori.equalsIgnoreCase("Adult")) {
        if (ukuran >= 40) {
          if (ukuran <= 44) {
            harga = "Rp1.500.000";
          }
        }
      }
    }

    System.out.println("Harga sepatu: " + harga);
    input.close();
  }
}