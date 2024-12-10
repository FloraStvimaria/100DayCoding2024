import java.time.ZoneId;
import java.time.LocalTime;
import java.util.Scanner;
public class Day100 {
    
    public static void main(String[] args) {
        Scanner flo = new Scanner(System.in);
        
        System.out.print("Masukkan nama : ");
        String f = flo.nextLine();
        
        LocalTime jam = LocalTime.now(ZoneId.of("Asia/Makassar"));
        int l = jam.getHour();
                
        String r;
        if (l < 12 ) {
            r = "Selamat pagi";
        }else if (l >= 12 && l < 17){
            r = "Selamat siang";
        }else{
            r = "Selamat malam";
        }
        System.out.println("====================");
        System.out.println(r + "," + f);
        System.out.println("Program Anda Telah Selesai");
        System.out.println("====================");
    }
}
