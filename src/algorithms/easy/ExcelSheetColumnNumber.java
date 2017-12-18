/**
 * 
 */
package algorithms.easy;

/**
 * @author mamamiyear
 * @date 2015年10月14日
 * 
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * For example:
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28 
 */
public class ExcelSheetColumnNumber {
	
	public int titleToNumber(String s) {
		
		int result = 0;
		char[] chars = s.toCharArray();
		for(int i = chars.length; i > 0; i--) {
			int val = (int) chars[chars.length - i] - 64;
			result += (val*powerOf(26, i-1));
		}
		return result;
        
    }
	
	public int powerOf(int val, int i) {
		
		int result = 1;
		for(int j = 0; j < i; j++)
			result *= val;
		return result;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(new ExcelSheetColumnNumber().titleToNumber("AZZ"));
	}

}
