package algorithms.easy;

/**
 * @author mamamiyear
 *         on 2015/12/5
 *
 * Given an integer, write a function to determine if it is a power of two.
 */
public class PowerofTwo {

    public boolean isPowerOfTwo(int n) {

        if (n == 1) {
            return true;
        } else if(n > 1 && n % 2 == 0) {
            return isPowerOfTwo(n / 2);
        } else {
            return false;
        }

    }

    public boolean isPowerOfTwo1(int n) {
        if(n <= 0) return false;
        while(n > 0) n = n<<1;
        if (n == Integer.MIN_VALUE) return true;
        else return false;
    }

    public static void main(String[] args) {

        int testNum = 27;
        System.out.println(Integer.toBinaryString(testNum));
        System.out.println(new PowerofTwo().isPowerOfTwo1(testNum));

    }

}
