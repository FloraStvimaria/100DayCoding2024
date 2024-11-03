public class Day63 {
    public static void main(String[] args) {
        for ( int f = 10; f <= 20; f++) {
            if (f % 2 == 0) {
                continue;
            }
            System.out.print(f + " ");
        }
    }
}
