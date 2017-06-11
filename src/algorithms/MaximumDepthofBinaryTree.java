/**
 * 
 */
package algorithms;


import testutils.TreeNode;

/**
 * @author mamamiyear
 * @date 2015年10月13日
 * 
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path 
 * from the root node down to the farthest leaf node.
 *
 * @see testutils.TreeNode
 */

public class MaximumDepthofBinaryTree {
	
	public int maxDepth(TreeNode root) {
		
		if(root == null) return 0;
		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);
        return leftDepth > rightDepth ? leftDepth+1 : rightDepth+1;
        
    }
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
	}

}
