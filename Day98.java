public class Day98 {
    public static void main(String[] args) {
        int f,l,o,r,a;
        f = 13; l = 20; o = 0;
        
        r = (f % 2 == 0) ? f : f + 1;
        for (a = r; a <= l; a += 2) {
            o += a;
        }
        System.out.println("Total penjumlahan bilangan genap dari " + f + " - " + l + " adalah : " + o);
    }
}
