
public class latihan2 {
    public static void main(String[] args) {
        char h = 'a';
        for (int i = 0; i < 5; i++) {
            for (int s = 0; s < 4 - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print(h);
                h++;
            }
            System.out.println();
        }
    }
}