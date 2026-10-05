import java.util.Scanner;
public class  PemilihanIf_25 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("--CETAK KRS SIAKAD--");
    System.out.print("Apakah pembayaran UKT sudah lunas? (true/false): ");
    boolean ukt = scanner.nextBoolean();
    
    if (ukt) {
      System.out.println("pembayaran UKT sudah lunas, cetak KRS berhasil.");
    } else {
      System.out.println("silahkan cetak KRS dan  minta tanda tangan DPA.");
    }
    
    scanner.close();
  }
}