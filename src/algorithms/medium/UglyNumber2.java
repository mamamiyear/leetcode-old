/**
 * 
 */
package algorithms.medium;

import java.util.LinkedList;
import java.util.Queue;


/**
 * @author mamamiyear
 * @date 2015年10月8日
 * 
 * Write a program to find the n-th ugly number.
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
 * For example, 1, 2, 3, 4
 * , 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.
 * Note that 1 is typically treated as an ugly number.
 * Hint:
 * 1.The naive approach is to call isUgly for every number until you reach the n-th one. 
 * 	 Most numbers are not ugly. Try to focus your effort on generating only the ugly ones.
 * 2.An ugly number must be multiplied by either 2, 3, or 5 from a smaller ugly number.
 * 3.The key is how to maintain the order of the ugly numbers. 
 *   Try a similar approach of merging from three sorted lists: L1, L2, and L3.
 * 4.Assume you have U-k, the k-th ugly number. Then U-k+1 must be Min(L1 * 2, L2 * 3, L3 * 5).
 * 
 * Difficlty: Medium
 */
public class UglyNumber2 {
	
	
	public int nthUglyNumber(int n) {
		
		Integer result = 0;
		Queue<Integer> que2 = new LinkedList<Integer>();
		Queue<Integer> que3 = new LinkedList<Integer>();
		Queue<Integer> que5 = new LinkedList<Integer>();
		que2.offer(1);
		que3.offer(1);
		que5.offer(1);
		for(int i = 1; i <= n; i++) {
			
			result = compareMin(que2.peek(), que3.peek(), que5.peek());
			if(que2.peek().equals(result)) que2.poll();
			if(que3.peek().equals(result)) que3.poll();
			if(que5.peek().equals(result)) que5.poll();
			que2.offer(result*2);
			que3.offer(result*3);
			que5.offer(result*5);
			
		}
		return result;
		
	}
	
	public int compareMin(Integer a, Integer b, Integer c) {
		
		int minNum = a <= b ? a : b;
		minNum = minNum <= c ? minNum : c;
		return minNum;
		
	}
		
		
	
	public static void main(String[] args) {
		int testNth = 39;
		System.out.println(new UglyNumber2().nthUglyNumber(testNth));
	}

}
