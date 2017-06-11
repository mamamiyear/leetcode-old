/**
 * 
 */
package algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mamamiyear
 * @date 2015年10月21日
 * 
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 * 
 * 1~9: {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
 * 10~90: {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
 * 100~900: {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
 * 1000~3000: {"M", "MM", "MMM"}.
 * 
 */
public class RomantoInteger {
	
    public int romanToInt(String s) {
        
    	Map<Character, Integer> map = new HashMap<Character, Integer>();
    	map.put('I', 1);
    	map.put('V', 5);
    	map.put('X', 10);
    	map.put('L', 50);
    	map.put('C', 100);
    	map.put('D', 500);
    	map.put('M', 1000);
    	
    	int result = 0;
    	char[] romanNumber = s.toCharArray();
    	for(int i = 0; i < romanNumber.length; i++) {
    		int j = i + 1;
    		if(j < romanNumber.length) {
    			int current = map.get(romanNumber[i]);
        		int next = map.get(romanNumber[j]);
        		if(current < next) result -= current;
        		else result += current;
    		} else {
    			result += map.get(romanNumber[i]);
    		}
    		
    	}
    	
    	return result;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		String test = "DCXXI";
		System.out.println(new RomantoInteger().romanToInt(test));
		
	}

}
