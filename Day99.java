import java.util.Scanner;

public class Day99 {
    public static void main(String[] args) {
        Scanner flo = new Scanner(System.in);
        
        System.out.print("Masukkan angka : ");
        double a1 = flo.nextDouble();
        
        System.out.print("Masukkan operator (+, -, *, /): ");
        char a = flo.next().charAt(0);
        
        System.out.print("Masukkan angka : ");
        double a2 = flo.nextDouble();
        
        double h = 0;
        
        switch (a) {
            case '+':
                h = a1 + a2;
                break;
            case '-':
                h = a1 - a2;
                break;
            case '*':
                h = a1 * a2;
                break;
            case '/':
                if (a2 != 0) {
                    h = a1 / a2;
                } else {
                    System.out.println("Kesalahan: Pembagian dengan nol!");
                    flo.close();
                    return;
                }
                break;
            default:
                System.out.println("Operator tidak valid!");
                flo.close();
                return;
        }
        
        System.out.println("Hasil : " + h);

        flo.close();
    }
}
