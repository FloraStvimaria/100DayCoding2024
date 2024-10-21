import java.util.Scanner;
public class Day50 {
    public static void main(String[] args) {
        Scanner flo = new Scanner(System.in);
        
        System.out.print("Masukkan angka : ");
        int f = flo.nextInt();
        
        if (f > 10 ) {
            System.out.println("yess");
        }else if (f < 10 ) {
            System.out.println("yeah");
        }else {
            System.out.println("yessir");
        }
    }
    
}
