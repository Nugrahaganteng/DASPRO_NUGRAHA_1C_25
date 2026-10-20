package tugasteori.pertemuan9;

import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan jumlah jam kerja (negatif untuk berhenti): ");
            double jamKerja = sc.nextDouble();

            if (jamKerja < 0) {
                break;
            }

            System.out.print("Masukkan gaji harian pegawai: ");
            double gajiHarian = sc.nextDouble();

            double bonus = 0;
            if (jamKerja > 8) {
                bonus = 0.20 * gajiHarian;
            }

            System.out.println("Bonus yang diterima: Rp " + bonus);
            System.out.println("----------------------------------------");
        }

        System.out.println("Program dihentikan.");
        sc.close();
    }
}