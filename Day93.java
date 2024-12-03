import java.util.Scanner;

public class Day93 {
    public static void main(String[] args) {
        Scanner flo = new Scanner(System.in);
        
        System.out.print("Masukkan angka : ");
        int f = flo.nextInt();
        System.out.println("==================");
        
        for (int l = 0; l < f; l++) {
            for (int o = 0; o < (f - l - 1); o++) {
                System.out.print(" ");
            }
            System.out.print("×");
            
            if (l > 0) {
                for (int r = 0; r < (2 * l - 1); r++) {
                    System.out.print(" ");
                }
                System.out.print("×");
            }
            System.out.println();
        }
        flo.close();
    }
}
