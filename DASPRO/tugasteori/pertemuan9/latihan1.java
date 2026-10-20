package tugasteori.pertemuan9;

import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalJam = 0;
        int hari = 1;

        while (hari <= 7) {
            System.out.print("Masukkan jam belajar hari ke-" + hari + ": ");
            int jamBelajar = sc.nextInt();

            if (jamBelajar > 10) {
                System.out.println("Input tidak valid (di atas 10 jam). Silakan masukkan ulang!");
                continue; 
            }

            totalJam += jamBelajar;
            hari++;
        }

        System.out.println("Total jam belajar selama seminggu: " + totalJam + " jam");
        sc.close();
    }
}