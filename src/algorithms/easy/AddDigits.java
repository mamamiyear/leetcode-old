/**
 * 
 */
package algorithms.easy;

/**
 * @author mamamiyear
 * @date 2015年9月29日
 * 
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * For example:
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 * 
 * Difficulty: Easy
 */
public class AddDigits {
	
//	public int addDigits(int num) {
//		/*复杂度：O(n)*/
//		num = (num % 10) + (num / 10);
//		if(num >= 10) {
//			return addDigits(num);
//		} else {
//			return num;
//		}
//    }
	
	public int addDigits(int num) {
		/* 复杂度：O(1)
		 * 思路：结果只能为1~9之间，而所有数最终相加的结果也只有1~9，
		 * *关键*相加的结果对9求余便获得了最终的结果的映射，
		 * 观察得10对9求余得到了与1对9求余相同的结果，
		 * 进一步思考任意位置上的数+1，最终结果便加1，而对9求余结果也加1（或者由8变为0）
		 * 进一步思考得如下结果*/
		return ((num-1) % 9 + 1);
	}
	
	public static void main(String[] args) {
		
		int testNumber = 196518;
		System.out.println(new AddDigits().addDigits(testNumber));

	}

}
