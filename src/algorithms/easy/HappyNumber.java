/**
 * 
 */
package algorithms.easy;

import java.util.ArrayList;

/**
 * @author mamamiyear
 * @date 2015年9月29日
 * 
 * A happy number is a number defined by the following process: 
 * Starting with any positive integer, replace the number by the sum of the squares of its digits, 
 * and repeat the process until the number equals 1 (where it will stay), 
 * or it loops endlessly in a cycle which does not include 1. 
 * Those numbers for which this process ends in 1 are happy numbers.
 * Example: 19 is a happy number
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 * 
 * Difficulty: Easy
 */
public class HappyNumber {
	
	
	public boolean isHappy(int n) {
		
        int digit = 0;
        int temp = n;
        int sum = 0;
        ArrayList<Integer> digits = new ArrayList<>();
        while(temp > 0) {
        	
        	digit = temp % 10;
        	digits.add(digit);
        	temp = temp / 10;
        	
        }
        System.out.println(digits);
        for (int i = 0; i < digits.size(); i++) {
			
        	sum = sum + (digits.get(i)*digits.get(i));
        	
		}
        
        if(sum >= 10) {
        	return isHappy(sum);
        } else if(sum == 1) {
        	return true;
        } else {
        	return false;
        }
        
        
    }
	
	public static void main(String[] args) {
		int testNumber = 345;
		System.out.println(new HappyNumber().isHappy(testNumber));
	}

}
