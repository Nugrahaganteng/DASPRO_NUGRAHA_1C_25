
import java.util.Scanner;
public class  PemilihanSwitch25  {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("--CETAK KRS SIAKAD--");
    System.out.print("Masukkan semester (1-8): ");
    int semester = scanner.nextInt();
    
    switch (semester) {
      case 1:
      System.out.println("KRS SEMSTER 1  di tampilkan.");
        break;
      case 2:
        System.out.println("KRS SEMSTER 2 di tampilkan.");
        break;
        case 3:
        System.out.println("KRS SEMSTER 3 di tampilkan.");
        break;
         case 4:
        System.out.println("KRS SEMSTER 4 di tampilkan.");
        break;
         case 5:
        System.out.println("KRS SEMSTER 5 di tampilkan.");
        break;
         case 6:
        System.out.println("KRS SEMSTER 6 di tampilkan.");
        break;
         case 7:
        System.out.println("KRS SEMSTER 7 di tampilkan.");
        break;
         case 8:
        System.out.println("KRS SEMSTER 8 di tampilkan.");
        break;
      default:
        System.out.println("Input tidak valid.");
        break;
    }
    
    scanner.close();
  }
}