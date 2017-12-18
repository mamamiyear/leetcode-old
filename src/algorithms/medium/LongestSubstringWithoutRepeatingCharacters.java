package algorithms.medium;

/**
 * Created by MMMy on 2016/5/17.
 *
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        int maxLength = 0;
        int res = 1;
        int head = 0;
        for (int i=1; i<s.length(); i++) {
            boolean flag = true;
            for (int j = head; j < i; j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    head = j + 1;
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
            if (flag) res++;
            else {
                maxLength = Math.max(maxLength, res);
                res = i - head + 1;
            }
        }
        maxLength = Math.max(maxLength, res);
        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        String testcase = "pwwkew";
        System.out.println(l.lengthOfLongestSubstring(testcase));
    }
}
