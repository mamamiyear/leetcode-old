package algorithms;

import testutils.TreeNode;

/**
 * @author mamamiyear
 *         on 2015/12/6
 *
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as a binary tree
 * in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * @see testutils.TreeNode
 */
public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);
        return Math.abs(leftDepth - rightDepth) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int getDepth(TreeNode root) {
        if(root == null) return 0;
        int l = getDepth(root.left) + 1;
        int r = getDepth(root.right) + 1;
        return Math.max(l, r);
    }

    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        TreeNode root = TreeNode.generateTestCase("1,null,2,null,3");
        boolean result = new BalancedBinaryTree().isBalanced(root);
        System.out.println(result);
    }

}
