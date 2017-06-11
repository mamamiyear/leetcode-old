/**
 * 
 */
package algorithms;

/**
 * @author mamamiyear
 * @date 2015年10月14日
 * 
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 * For example:
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB 
 * 思路：用ASCII码计算, 'A'的ASCII码为65.
 */
public class ExcelSheetColumnTitle {
	
	public String convertToTitle(int n) {
		char[] digit = new char[1];
		if(n <= 26) {
			digit[0] = (char) (n + 64);
			return new String(digit);
		} else {
			if(n % 26 == 0) {
				digit[0] = (char) (26 + 64);
				n = n / 26 - 1;
			} else {
				digit[0] = (char) (n % 26 + 64);
				n /= 26;
			}
			
			return convertToTitle(n) + new String(digit);
		}
        
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(new ExcelSheetColumnTitle().convertToTitle(1378));
	}

}
