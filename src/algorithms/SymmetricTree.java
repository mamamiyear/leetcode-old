package algorithms;

import testutils.TreeNode;

/**
 * @author mamamiyear
 *         on 2015/12/29
 *
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * For example, this binary tree is symmetric:
 *          1
 *         / \
 *        2   2
 *       / \ / \
 *      3  4 4  3
 * But the following is not:
 *          1
 *         / \
 *        2   2
 *         \   \
 *          3   3
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        if(root.left == null || root.right == null) return false;
        root.left = invertTree(root.left);
        return isSameTree(root.right, root.left);
    }

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

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }

    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        TreeNode root = TreeNode.generateTestCase("1,2,3");
        boolean result = new SymmetricTree().isSymmetric(root);
        System.out.println(result);
    }

}
