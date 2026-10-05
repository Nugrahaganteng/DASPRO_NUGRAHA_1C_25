import java.util.Scanner; 

public class TugasParkir25 {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

        System.out.print("Lama parkir (jam): ");
        int jam = input.nextInt();

        int tarif;

        if (jam <= 2) {
            tarif = 2000;
        } else {
            tarif = 2000 + (jam - 2) * 1000;
        }

        System.out.println("Tarif parkir: " + tarif);

  }
}