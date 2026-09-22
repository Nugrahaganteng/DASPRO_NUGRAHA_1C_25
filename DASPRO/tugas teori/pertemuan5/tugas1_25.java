import java.util.Scanner;

public class tugas1_25 {
    public static void main(String[] args) {
        // int menu = 1;

        // switch (menu) {
        //     case 1:
        //         System.out.println("Input Nilai");
        //         break;
        //     case 2:
        //         System.out.println("Lihat Transkrip");
        //         break;
        //     case 3:
        //         System.out.println("Cetak KRS");
        //         break;
        //     default:
        //         System.out.println("Menu tidak valid");
        // }

        // int saldo = 60000;

        // if (saldo >= 50000) {
        //     System.out.println("bisa beli kopi");
        // } else {
        //     System.out.println("tidak bisa beli kopi");
        // }
// String ukt = "lunas";
        
// if(ukt== "lunas") { 
//     System.out.println("Cetak kartu ujian berhasil");
// } else {
//     System.out.println("Bayar UKT terlebyyih dahulu");
// }
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