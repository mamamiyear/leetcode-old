package algorithms.medium;

/**
 * Created by MMMy on 2016/5/17.
 *
 * Given a string S, find the longest palindromic substring in S.
 * You may assume that the maximum length of S is 1000,
 * and there exists one unique longest palindromic substring.
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int maxState = 0;
        int[] currentState;
        int[] temp = new int[chars.length];
        int[] curMaxState = new int[chars.length];
        for (int i = chars.length - 1; i >= 0; i--) {
            currentState = new int[chars.length];
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    if (j == 0) currentState[j] = 1;
                    else currentState[j] = temp[j - 1] + 1;
                }
            }
            boolean flag = false;
            for (int val : currentState) {
                if(val>maxState){
                    maxState = val;
                    flag = true;
                }
            }
            if (flag) {
                curMaxState = currentState;
            }
            temp = currentState;
        }
        int index = 0;
        int max = curMaxState[0];
        for (int i = 0; i < curMaxState.length; i++) {
            if (curMaxState[i] > max) {
                max = curMaxState[i];
                index = i;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = index; i > index - max; i--) {
            builder.append(chars[i]);
        }
        return builder.toString();

    }

    public static void main(String[] args) {
        String testcase = "cbabbade";
        System.out.println(new LongestPalindromicSubstring().longestPalindrome(testcase));
    }
}
