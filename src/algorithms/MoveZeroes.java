/**
 * 
 */
package algorithms;

/**
 * @author mamamiyear
 * @date 2015年10月13日
 * 
 * Given an array nums, write a function to move all 0's to the end of it 
 * while maintaining the relative order of the non-zero elements.
 * For example, 
 * given nums = [0, 1, 0, 3, 12], 
 * after calling your function, nums should be [1, 3, 12, 0, 0].
 */
public class MoveZeroes {
	
	public void moveZeroes(int[] nums) {
		
		int[] tempNums = new int[nums.length];
		int index = 0;
		for(int i = 0 ; i < nums.length; i++) {
			
			if(nums[i] != 0) {
				tempNums[index] = nums[i];
				index++;
			}
					
		}
		
		for(int i = 0 ; i < nums.length; i++) {
			nums[i] = tempNums[i];
		}
        
    }
	
	

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] testNums = {0, 1, 0, 3, 12};
		new MoveZeroes().moveZeroes(testNums);
		for(int temp : testNums) {
			System.out.println(temp);
		}
	}
		

}
