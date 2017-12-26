package algorithms.easy;


/**
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 *
 * Example:
 * Given a = 1 and b = 2, return 3.
 */
public class SumofTwoIntegers {

    public int getSum(int a, int b) {
        return Math.addExact(a, b);
    }

    public static void main(String[] args) {
        System.out.println(new SumofTwoIntegers().getSum(1, 2));
    }
}
