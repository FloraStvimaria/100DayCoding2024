import java.util.Scanner;

public class Day92 {
    public static void main(String[] args) {
        Scanner flo = new Scanner(System.in);
        
        System.out.print("Masukkan angka : ");
        int f = flo.nextInt();
        System.out.println("==================");
        
        for (int l = 0; l < f; l++) {
            for (int o = 0; o < l; o++) {
                System.out.print(" ");
            }
            System.out.print("×");
            
            if (l < f - 1) {
                for (int r = 0; r < (2 * (f - l - 1) - 1); r++) {
                    System.out.print(" ");
                }
                System.out.print("×");
            }
            System.out.println();
        }
        flo.close();
    }
}
