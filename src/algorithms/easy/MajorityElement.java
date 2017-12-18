/**
 * 
 */
package algorithms.easy;

import java.util.ArrayList;

/**
 * @author mamamiyear
 * @date 2015年10月14日
 * 
 * Given an array of size n, find the majority element. 
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element 
 * always exist in the array.
 */
public class MajorityElement {
	
	public int majorityElement(int[] nums) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i : nums) {
			if(!numbers.contains(i)) {
				numbers.add(i);
			}
		}
		
		int[] counts = new int[numbers.size()];
		for(int i : nums) {
			counts[numbers.indexOf(i)]++;
		}
		
		for(int i = 0; i < counts.length; i++) {
			if(counts[i] >= (nums.length + 1) / 2) return numbers.get(i);
		}
		return 0;
        
    }
	


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int[] testNums = {1, 2, 1, 1, 1, 3, 2, 2};
		System.out.println(new MajorityElement().majorityElement(testNums));
		
	}

}
