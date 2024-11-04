public class Day64 {
    public static void main(String[] args) {
        
        outerLoop:
        for (int f = 1; f <= 3; f++) {
            System.out.println("Luar f : " + f);

            for (int s = 1; s <= 3; s++) {
                System.out.println("  Dalam s : " + s);
                
                if (f == 2 && s == 3) {
                    System.out.println("Udahhh (:");
                    break outerLoop;
                }
            }
        }
    }
}
