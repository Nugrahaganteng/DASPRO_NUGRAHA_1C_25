
import java.util.Scanner;
public class Tugas1Pemilihan25  {
  public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
    System.out.println("--CETAK KRS SIAKAD--");
    System.out.print("Apakah pembayaran UKT sudah lunas? (true/false): ");
    boolean ukt = scanner.nextBoolean();
    
    String pesan = ukt
         ? "pembayaran UKT sudah lunas, cetak KRS berhasil."
        : "silahkan cetak KRS dan  minta tanda tangan DPA.";
    System.out.println(pesan);
    
    scanner.close();
  }
}