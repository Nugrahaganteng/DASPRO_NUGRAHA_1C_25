import java.util.Scanner;

public class pemilihanifelse25 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("--CETAK KRS SIAKAD--");
    System.out.print("Masukkan semester (1-8): ");
    int semester = scanner.nextInt();
    
    if (semester == 1) {
      System.out.println("KRS SEMSTER 1  di tampilkan.");
    } else if (semester == 2) {
      System.out.println("KRS SEMSTER 2 di tampilkan.");
    } else if (semester == 3) {
      System.out.println("KRS SEMSTER 3 di tampilkan.");
    } else if (semester == 4) {
      System.out.println("KRS SEMSTER 4 di tampilkan.");
    } else if (semester == 5) {
      System.out.println("KRS SEMSTER 5 di tampilkan.");
    } else if (semester == 6) {
      System.out.println("KRS SEMSTER 6 di tampilkan.");
    } else if (semester == 7) {
      System.out.println("KRS SEMSTER 7 di tampilkan.");
    } else if (semester == 8) {
      System.out.println("KRS SEMSTER 8 di tampilkan.");
    } else {
      System.out.println("Input tidak valid.");
    }
    
    scanner.close();
  }
}