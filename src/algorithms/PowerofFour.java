package algorithms;

/**
 * Created by mamamiyear on 16-5-19.
 *
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 *
 * Example:
 * Given num = 16, return true. Given num = 5, return false.
 *
 * Follow up: Could you solve it without loops/recursion?
 */
public class PowerofFour {
    public boolean isPowerOfFour(int num) {
        return Math.log(num) / Math.log(4) % 1 == 0;
//        return num > 0 && Integer.toBinaryString(num).length() % 2 == 1 && num << (32 - Integer.toBinaryString(num).length()) == Integer.MIN_VALUE;
    }
    public static void main(String[] args) {
        PowerofFour solution = new PowerofFour();
        long before = System.currentTimeMillis();
        boolean res = solution.isPowerOfFour(256);
        long after = System.currentTimeMillis();
        long time = after - before;
        System.out.println(res);
        System.out.println(time);
    }
}
