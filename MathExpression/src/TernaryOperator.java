import static java.lang.Math.sqrt;

public class TernaryOperator {
        public static void ternary(int x, int y, int z) {
            int hitung = (int) sqrt(x^2 + y^2);
            boolean hasil;
            if (hitung == z){
                System.out.println("1");
            }else {
                System.out.println("-1");
            }

    }
}
