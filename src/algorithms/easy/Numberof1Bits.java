/**
 * 
 */
package algorithms.easy;

/**
 * @author mamamiyear
 * @date 2015年10月14日
 * 
 * Write a function that takes an unsigned integer and returns 
 * the number of '1' bits it has (also known as the Hamming weight).
 * For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, 
 * so the function should return 3.
 */
public class Numberof1Bits {
	// you need to treat n as an unsigned value
    public int hammingWeight(int n) {
    	
    	int origin = n;
    	int result = 0;
    	while(origin != 0){
    		int temp = origin;
    		System.out.println(temp);
    		origin = origin >>> 1;
    		int temp2 = origin << 1;
    		if(temp != temp2) {
        		result++;
        	}
    	}
    	return result;

    }
    

    
    public static void main(String[] args) {
		Integer testNumber = (int) 4294967295L;
    	System.out.println(testNumber);
    	System.out.println(Integer.toBinaryString(testNumber));
    	System.out.println("结果为：" + new Numberof1Bits().hammingWeight(testNumber));
    	
	}

}
