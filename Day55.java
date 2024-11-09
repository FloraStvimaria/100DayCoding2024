public class Day55 {
    public static void main(String[] args) {
        int ra = 0;
        for (int flo = 10; flo > 5; flo--) {
            System.out.println("Nilai : " + flo);
            ra += flo;
        }
        System.out.print("Jumlah nilai flo : " + ra);
    }
    
}
