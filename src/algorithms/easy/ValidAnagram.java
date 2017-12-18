/**
 * 
 */
package algorithms.easy;

import java.util.ArrayList;

/**
 * @author mamamiyear
 * @date 2015年10月19日
 * 
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example:
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * Note:
 * You may assume the string contains only lowercase alphabets.
 */
public class ValidAnagram {
	
	public boolean isAnagram(String s, String t) {
		
		if(s.length() == t.length()) {
			char[] sChars = s.toCharArray(); 
			char[] tChars = t.toCharArray();
			ArrayList<Character> sList = new ArrayList<Character>();
			ArrayList<Character> tList = new ArrayList<Character>();
			for(char c : sChars) sList.add(c);
			for(char c : tChars) tList.add(c);
			for(Character sChar : sList) {
				boolean flag = false;
				for(Character tChar : tList) {
					if(sChar.equals(tChar)) {
						tList.remove(tChar);
						flag = true;
						break;
					}
				}
				if(!flag) return false;
			}
			if(tList.isEmpty()) return true;
			return false;
		}
		return false;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String sTest = "anagras";
		String tTest = "nagaram";
		System.out.println(new ValidAnagram().isAnagram(sTest, tTest));
	}

}
