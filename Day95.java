import java.util.Scanner;

public class Day95 {
    public static void main(String[] args) {
        Scanner flo = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int f = flo.nextInt();
        System.out.println("====================");

        for (int l = 1; l <= f; l++) {
            for (int o = 1; o <= l; o++) {
                System.out.print("*");
            }

            for (int r = 0; r < (2 * (f - l)); r++) {
                System.out.print(" ");
            }

            for (int o = 1; o <= l; o++) {
                System.out.print("*");
            }

            System.out.println();
        }

        flo.close();
    }
}
