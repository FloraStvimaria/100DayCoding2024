import java.util.Scanner;
public class Day88 {
    public static void main(String[] args) {
        Scanner flo = new Scanner(System.in);
        double jj,t,v;
        System.out.print("Masukkan jari² tabung : ");
        jj = flo.nextDouble();
        
        System.out.print("Masukkan tinggi tabung : ");
        t = flo.nextDouble();
        
        v = 3.14 * Math.pow(jj, 2) * t;
        System.out.printf("Volume tabung : %.2f m³\n", v);
        
        flo.close();
    }
}
