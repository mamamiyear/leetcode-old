/**
 * 
 */
package algorithms.easy;


import testutils.TreeNode;

/**
 * @author mamamiyear
 * @date 2015年10月13日
 * 
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical 
 * and the nodes have the same value.
 *
 * @see testutils.TreeNode
 */
public class SameTree {
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
		
		if(p == null && q == null) return true;
		if(p == null || q == null) return false;
		if(p.val != q.val) return false;
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		
    }
	
	public static void main(String[] args) {
		
	}
	
}
