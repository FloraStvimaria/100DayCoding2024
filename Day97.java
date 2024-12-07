import java.util.Scanner;

public class Day97 {
    public static void main(String[] args) {
        Scanner flo = new Scanner(System.in);
        
        System.out.print("Masukkan angka : ");
        int f = flo.nextInt();

        System.out.println("Bilangan prima 1 - " + f + " adalah :");
        for (int l = 2; l <= f; l++) {
            if (isPrima(l)) {
                System.out.print(l + " ");
            }
        }
    }
    
    public static boolean isPrima(int ra) {
        if (ra < 2) return false;
        for (int o = 2; o <= Math.sqrt(ra); o++) {
            if (ra % o == 0) {
                return false;
            }
        }
        return true;
    }
}
