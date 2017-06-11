/**
 * 
 */
package algorithms;

/**
 * @author mamamiyear
 * @date 2015年10月23日
 * 
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {
	
	public int climbStairs(int n) {
        
		
		
//		if(n < 0) return 0;
//		if(n == 0) return 0;
//		if(n == 1) return 1;
//		if(n == 2) return 2;
//		else {
//			return climbStairs(n - 2) + climbStairs(n - 1);
////			return 2 * climbStairs(n - 2) + climbStairs(n - 3);
//		}
		
		if(n <= 2)  
        {  
            return n;  
        }  
        else  
        {  
            int[] step = new int[n];  
              
            step[0] = 1;  
            step[1] = 2;  
              
            for(int i = 2; i < n; i++)  
            {  
                step[i] = step[i-1] + step[i-2];  
            }  
            return step[n-1];  
        }     
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int testStairs = 44;
		System.out.println("共有不同上楼法：" + new ClimbingStairs().climbStairs(testStairs) + "种.");
	}

}
