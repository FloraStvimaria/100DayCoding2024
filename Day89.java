import java.util.Scanner;

public class tes89 {
    public static void main(String[] args) {
        Scanner flo = new Scanner(System.in);
        boolean isPalindrome = false;

        while (!isPalindrome) {
            System.out.print("Masukkan kata : ");
            String ra = flo.nextLine().trim();

            String lo = new StringBuilder(ra).reverse().toString();
            if (ra.equals(lo)) {
                System.out.println("Yes");
                isPalindrome = true;  
            } else {
                System.out.println("No, coba lagi!");
            }
        }

        flo.close();
    }
}
