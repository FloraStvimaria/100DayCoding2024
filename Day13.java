public class Main {
    public static void main(String[] args) {
        // Deklarasi variabel
        int part1 = 10;
        int part2 = 20;

        // Variabel final
        final int part3 = 50;
        final byte part4 = 60;
        final String part5 = "DayCoding";

        // Print variabel sebelum update
        System.out.println("Sebelum update:");
        System.out.printf("part1 (int): " + part1);
        System.out.println("part2 (int): " + part2);
        System.out.println("part3 (final int): " + part3);
        System.out.println("part4 (final byte): " + part4);
        System.out.println("part5 (final String): " + part5);

        // Update nilai part1 dan part2
        part1 = 1000;
        part2 = 2000;

        // Print variabel setelah update
        System.out.println("Setelah update:");
        System.out.printf("part1 (int): " + part1);
        System.out.println("part2 (int): " + part2);
        System.out.println("part3 (final int): " + part3);  // final, tidak bisa diubah
        System.out.println("part4 (final byte): " + part4);  // final, tidak bisa diubah
        System.out.println("part5 (final String): " + part5);  // final, tidak bisa diubah
    }
}
