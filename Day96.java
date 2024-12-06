import java.util.Scanner;

public class Day96 {
    public static void main(String[] args) {
        Scanner flo = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int f = flo.nextInt();
        System.out.println("==================");
        
        for (int l = 0; l < f; l++) {
            for (int o = 0; o < (f - l - 1); o++) {
                System.out.print(" ");
            }
            for (int o = 0; o < (2 * l + 1); o++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int l = f - 2; l >= 0; l--) {
            for (int o = 0; o < (f - l - 1); o++) {
                System.out.print(" ");
            }
            for (int o = 0; o < (2 * l + 1); o++) {
                System.out.print("*");
            }
            System.out.println();
        }
        flo.close();
    }
}
