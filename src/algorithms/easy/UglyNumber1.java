/**
 * 
 */
package algorithms.easy;

/**
 * @author mamamiyear
 * @date 2015年10月8日
 * 
 * Write a program to check whether a given number is an ugly number.
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
 * For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.
 * Note that 1 is typically treated as an ugly number.
 * 
 */
public class UglyNumber1 {
	
	public boolean isUgly(int num) {
		
		System.out.println(num);
		
		if(num == 0) return false;
        if(num == 1) return true;
		
		if(num % 5 == 0) {
			/*结尾是 5 或 0 的数*/
			num = num / 5;
			if(num == 1) 
				return true;
			else 
				return isUgly(num);
		}
		
		if(num % 3 == 0) {
			num = num / 3;
			if(num == 1)
				return true;
			else 
				return isUgly(num);
		}
		
		if(num % 2 == 0) {
			num = num / 2;
			if(num == 1)
				return true;
			else 
				return isUgly(num);
		}
		
		return false;
		
    }
	
	public static void main(String[] args) {
		int testNumber = 12;
		System.out.println(new UglyNumber1().isUgly(testNumber));
	}

}
