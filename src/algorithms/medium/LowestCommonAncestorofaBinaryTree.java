package algorithms.medium;

import testutils.TreeNode;

/**
 * @author mamamiyear
 * @date 15-12-7
 *
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 * According to the definition of LCA on Wikipedia:
 * “The lowest common ancestor is defined between two nodes v and w as the lowest node
 * in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”
 *              _______3______
 *             /              \
 *          ___5__           __1__
 *         /      \         /     \
 *        6        2       0       8
 *                / \
 *               7   4
 * For example, the lowest common ancestor (LCA) of nodes 5 and 1 is 3.
 * Another example is LCA of nodes 5 and 4 is 5,
 * since a node can be a descendant of itself according to the LCA definition.
 *
 * @see testutils.TreeNode
 */

public class LowestCommonAncestorofaBinaryTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root == p) return p;
        if(root == q) return q;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null && right == null) return null;
        if(left != null && right == null) return left;
        if(left == null && right != null) return right;
        return root;
    }





    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO 自动生成的方法存根

        TreeNode root = TreeNode.generateTestCase("37,-34,-48,null,-100,-100,48,null,null,null,null,-54,null,-71,-22,null,null,null,8");
        TreeNode p = root.left.right;
        TreeNode q = root.right.left;
        int val = new LowestCommonAncestorofaBinaryTree().lowestCommonAncestor(root, p, q).val;
        System.out.println(val);

    }
}
