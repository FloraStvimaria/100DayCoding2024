import java.util.Scanner;

public class Day52 {
    public static void main(String[] args) {
        Scanner flo = new Scanner(System.in);
        
        System.out.print("Masukkan hari : ");
        int hari = flo.nextInt();
        
        String Hari = (hari == 1) ? "Hari: Senin" :
                          (hari == 2) ? "Hari: Selasa" :
                          (hari == 3) ? "Hari: Rabu" :
                          (hari == 4) ? "Hari: Kamis" :
                          (hari == 5) ? "Hari: Jumat" :
                          (hari == 6) ? "Hari: Sabtu" :
                          (hari == 7) ? "Hari: Minggu" :
                                        "Gak ada pake 1-7 aja";
        
        System.out.println(Hari);

        flo.close();
    }
}
