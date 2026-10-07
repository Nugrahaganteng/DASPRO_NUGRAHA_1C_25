import java.util.Scanner;

public class tugas2_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variabel
        double panjangTanah;
        double lebarTanah;
        double diameterKolam;
        double sisiTaman;
        double luasTanah;
        double jariJari;
        double luasKolam;
        double luasTaman;
        double luasSisa;

        // Input
        System.out.print("Panjang tanah: ");
        panjangTanah = input.nextDouble();

        System.out.print("Lebar tanah: ");
        lebarTanah = input.nextDouble();

        System.out.print("Diameter kolam: ");
        diameterKolam = input.nextDouble();

        System.out.print("Sisi taman: ");
        sisiTaman = input.nextDouble();

        // Proses
        luasTanah = panjangTanah * lebarTanah;
        jariJari = diameterKolam / 2;
        luasKolam = Math.PI * jariJari * jariJari;
        luasTaman = sisiTaman * sisiTaman;
        luasSisa = luasTanah - luasKolam - luasTaman;

        // Output
        System.out.println("Luas tanah: " + luasTanah + " m2");
        System.out.println("Luas kolam: " + luasKolam + " m2");
        System.out.println("Luas taman: " + luasTaman + " m2");
        System.out.println("Sisa luas: " + luasSisa + " m2");

        input.close();
    }
}