//SOAL 1
import java.util.Scanner;
public class EvaluasimentorSoal1 {
    public static void main(String[] args) {
       final double pi = 3.14159;
        Scanner flo = new Scanner(System.in);
        
        System.out.print("Input jari-jari : ");
        int jarijari = flo.nextInt();
        
        System.out.print("Input satuan : ");
        String satuan = flo.next();
        
        double keliling = 2 * pi * jarijari;
        double luas = pi * jarijari * jarijari;
        
        System.out.println("==========HASIL==========");
        System.out.println("Jari-jari : " + jarijari + " " + satuan);
       System.out.printf("Keliling : %.5f %s\n", keliling,satuan);
       System.out.printf("Luas : %.5f %s^2\n", luas,satuan);
       
    }
    
}

//SOAL 2
public class EvaluasimentorSoal2 {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        
        System.out.println(b);
        b -= a;
        System.out.println(b);
        
        b *= a;
        System.out.println(b);
        
        b -= a;
        System.out.println(b);
        
        b %= 4;
        b += 4;
        System.out.println(b);
        
        b += a;
        System.out.println(b);
    }
    
}
