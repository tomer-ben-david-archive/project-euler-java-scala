/**
 * @author tomerb
 * on 18/06/14.
 */
public class Euler03 {
    /**
     * Start dividing the n number by 2 if ok continue dividing by 2 when cant start divding by 3
     * The largest number you encounter would be a prime number because if its not you would already
     * be able to divide it by 2 or 3 or one of its smaller dividers.
     */
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

