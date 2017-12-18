package algorithms.easy;

/**
 * @author mamamiyear
 *         on 2016/1/27
 *
 * Given an integer, write a function to determine if it is a power of three.
 *
 * Follow up:
 * Could you do it without using any loop / recursion?
 */
public class PowerOfThree {

    public boolean isPowerOfThree1(int n) {
        return Math.log(n) / Math.log(3) % 1 == 0 || (1 - (Math.log(n) / Math.log(3)) % 1) < 0.00000000000001;
    }

    public static void main(String[] args) {
        int testNum = 730;
        System.out.println(new PowerOfThree().isPowerOfThree1(testNum));
    }
}
