package algorithms;

/**
 * Created by MMMy on 2016/5/12.
 *
 * Implement atoi to convert a string to an integer.
 *
 * Hint: Carefully consider all possible input cases. If you want a challenge,
 * please do not see below and ask yourself what are the possible input cases.
 *
 * Notes: It is intended for this problem to be specified vaguely (ie, no given input specs).
 * You are responsible to gather all the input requirements up front.
 */
public class StringtoIntegerAtoi {
    public int myAtoi(String str) {
        if (str == null) return 0;
        String originStr = str.trim();
        char[] chars = originStr.toCharArray();
        if ("".equals(originStr) || !(48 <= chars[0] && chars[0] <= 57 || chars[0] == 43 || chars[0] == 45)) return 0;
        int sign = 1;
        int sum = 0;
        int i = 0;
        int numBit = 0;
        if (chars[0] == 45) {
            i++;
            sign = -1;
        }
        if (chars[0] == 43) {
            i++;
            sign = 1;
        }
        for (; i < chars.length; i++) {
            if (48 <= chars[i] && chars[i] <= 57) {
                if (sign == 1 && (numBit > 10 || sum > 214748364 || (sum == 214748364 && chars[i] > 55))) {
                    return Integer.MAX_VALUE;
                }
                if (sign == -1 && (numBit > 10 || sum > 214748364 || (sum == 214748364 && chars[i] > 56))) {
                    return Integer.MIN_VALUE;
                }
                numBit++;
                sum = sum * 10 + Integer.parseInt(String.valueOf(chars[i]));
            } else {
                break;
            }
        }
        return sum * sign;
    }

    public static void main(String[] args) {
        StringtoIntegerAtoi stringtoIntegerAtoi = new StringtoIntegerAtoi();
        String testcase = "2147483645";
        String stander = String.valueOf(Integer.MAX_VALUE);
        System.out.println(testcase.compareTo(stander));
//        System.out.println(stringtoIntegerAtoi.myAtoi(testutils));
    }
}
