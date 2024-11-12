public class Day72 {
    public static int flo(int f) {
        if (f <= 10) {
            return 10;
        }
        return f * flo(f - 10);
    }
    public static void main(String[] args) {
        int ra = flo(20);
        System.out.println("Hasil : " + ra);
    }
    
}
