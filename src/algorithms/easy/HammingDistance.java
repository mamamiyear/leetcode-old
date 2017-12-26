package algorithms.easy;

import java.util.Arrays;
import java.util.Random;

/**
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * Given two integers x and y, calculate the Hamming distance.
 *
 * Note:
 * 0 ≤ x, y < 231.
 *
 * Example:
 *
 * Input: x = 1, y = 4
 * Output: 2
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *       ↑  ↑
 *
 * The above arrows point to positions where the corresponding bits are different.
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {
        int ret = 0;
        char[] a = Integer.toBinaryString(x).toCharArray();
        char[] b = Integer.toBinaryString(y).toCharArray();
        if (true) {
            String aa = Integer.toBinaryString(x);
            String bb = Integer.toBinaryString(y);
            String l = aa.length() > bb.length() ? aa : bb;
            String s = aa.length() <= bb.length() ? aa : bb;
            int dis = l.length() - s.length();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < dis; i++) {
                builder.append("0");
            }
            s = builder.append(s).toString();
            System.out.println("long : " + Arrays.toString(l.toCharArray()));
            System.out.println("short: " + Arrays.toString(s.toCharArray()));
        }
        int min, max;
        char[] longer, shorter;
        if (a.length < b.length) {
            min = a.length;
            max = b.length;
            shorter = a;
            longer = b;
        } else {
            min = b.length;
            max = a.length;
            shorter = b;
            longer = a;
        }

        for (int i = 1; i <= min; i++) {
            if (shorter[min - i] != longer[max - i]) {
                ret++;
            }
        }
        for (int i = min + 1; i <= max ; i++) {
            if (longer[max - i] == '1') {
                ret++;
            }
        }
        return ret;

    }

    public static void main(String[] args) {
        int ret, x, y;
        for (int i = 0; i < 10; i++) {
            x = new Random().nextInt();
            y = new Random().nextInt();
            ret = new HammingDistance().hammingDistance(x, y);
            System.out.println("ret: " + ret);
        }

    }

}
