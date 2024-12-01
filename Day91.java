import java.util.Scanner;
public class Day91 {
    public static void main(String[] args) {
        Scanner flo = new Scanner(System.in);
        
        while (true) {
            System.out.print("Masukkan angka : ");
            int ra = flo.nextInt();
            
            if (ra % 2 == 0) {
                System.out.println("Genap");
            } else {
                System.out.println("You and i, end");
                break;
            }
        }
        flo.close();
    }
}
