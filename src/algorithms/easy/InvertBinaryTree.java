/**
 * 
 */
package algorithms.easy;

import testutils.TreeNode;

/**
 * @author mamamiyear
 * @date 2015年10月13日
 * 
 * Invert a binary tree.
 * 
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * to
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 * 
 * Trivia:
 * This problem was inspired by this original tweet by Max Howell:
 * Google: 90% of our engineers use the software you wrote (Homebrew),
 * but you can’t invert a binary tree on a whiteboard so fuck off.
 *
 * @see testutils.TreeNode
 */
public class InvertBinaryTree {
	
	public TreeNode invertTree(TreeNode root) {
		
		if(root == null) return null;
		if(root.left == null && root.right == null) return root;
		TreeNode tempNode;
		tempNode = root.left;
		root.left = root.right;
		root.right = tempNode;
		if(root.left != null) invertTree(root.left);
		if(root.right != null) invertTree(root.right);
		
		return root;
        
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
