package algorithms.easy;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

/**
 * A self-dividing number is a number that is divisible by every digit it contains.
 *
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
 *
 * Example 1:
 * Input:
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * Note:
 *
 * The boundaries of each input argument are 1 <= left <= right <= 10000.
 */
public class SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {

        if(left > right || 1 > left || right > 10000) return null;

        List<Integer> ret = new LinkedList<>();

        for (int i = left; i <= right; i++) {
            if (isSelfDividingNumbers(i)) {
                ret.add(i);
            }
        }

        return ret;
    }

    private boolean isSelfDividingNumbers(int i) {
        int digit;
        while (i != 0) {
            digit = i % 10;
            if (digit == 0 || i % digit != 0) {
                return false;
            }
            i = i / 10;
        }
        return true;
    }

    public static void main(String[] args) {

        List<Integer> ret = new SelfDividingNumbers().selfDividingNumbers(1, 22);
        System.out.println(Arrays.toString(ret.toArray()));
    }
}
