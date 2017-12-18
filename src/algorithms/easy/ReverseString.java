package algorithms.easy;

/**
 * @author mamamiyear
 *         on 2016/5/11
 *
 * Write a function that takes a string as input and returns the string reversed.
 * Example:
 * Given s = "hello", return "olleh".
 */
public class ReverseString {

    public String reverseString(String s) {
        char[] ca = s.toCharArray();
        StringBuilder sbuff = new StringBuilder();
        for (int i = ca.length - 1; i >= 0 ; i--) {
            sbuff.append(ca[i]);
        }
        return sbuff.toString();
    }

}
