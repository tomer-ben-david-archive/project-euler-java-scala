/**
 * @author tomerb
 * on 18/06/14.
 */
public class Euler03 {
    private static int largestPrimeFactor(int compositeN) {
        int i;
        for (i = 2; i < compositeN; i++) {
            if (compositeN % i == 0) {
                compositeN /= i;
                i--;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(5768));
    }

}

