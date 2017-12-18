package algorithms.easy;

/**
 * Created by mamamiyear on 16-5-19.
 *
 * Given a non-negative number represented as an array of digits, plus one to the number.
 * The digits are stored such that the most significant digit is at the head of the list.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        boolean carry = false;
        for(int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 > 9) {
                digits[i] = digits[i] + 1 - 10;
                carry = true;
            } else {
                digits[i] = digits[i] + 1;
                carry = false;
                break;
            }
        }
        if (carry) return digits;
        else {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            System.arraycopy(digits, 0, res, 1, digits.length);
            return res;
        }
    }

    public int[] plusOne2(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            if (0 == i && digits[i] == 9) {
                int[] digits2 = new int[digits.length + 1];
                digits2[0] = 1;
                return digits2;
            }
            if (digits[i] == 9) {
                digits[i] = 0;
                continue;
            }
            digits[i] ++;
            break;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] testcase = {9, 9, 9, 9, 9};
        int[] res = new PlusOne().plusOne2(testcase);
        for (int re : res) System.out.println(re);
    }
}
