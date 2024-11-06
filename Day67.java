public class Day67 {
    public static void main(String[] args) {
        int f = 6;
        System.out.println("Persegi:");
        System.out.println("========");
        
        for (int s = 0; s < f; s++) { 
            for (int y = 0; y < f; y++) { 
                System.out.print(" $ ");
            }
            System.out.println();
        }

        System.out.println();
        
        int kolom = 8;
        int baris = 4;
        System.out.println("Persegi Panjang:");
        System.out.println("================");
        
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(" € ");
            }
            System.out.println();
        }
    }
}
