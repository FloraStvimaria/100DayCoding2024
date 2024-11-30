import java.util.Scanner;
public class Day90 {
    public static void main(String[] args) {
        Scanner flo = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah angka : ");
        int f = flo.nextInt();
        
        System.out.print("Masukkan angka : ");
        int[] o = new int[f];
        for (int l = 0; l < f; l++) {
            o[l] = l + 1;
            System.out.print(o[l] + " ");
        }
        
        System.out.println();
        System.out.print("Urutan kebalik : ");
        for (int l = f - 1; l >= 0; l--){
            System.out.print(o[l] + " ");
            
        }
        flo.close();
    }
}
