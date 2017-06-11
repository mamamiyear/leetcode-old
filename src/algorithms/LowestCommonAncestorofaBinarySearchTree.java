/**
 * 
 */
package algorithms;

import testutils.TreeNode;

/**
 * @author mamamiyear
 * @date 2015年10月13日
 * 
 * Given a binary search tree (BST)
 * (BST, which is a specific binary tree with it's all nodes
 * whose all nodes of left subtree less than itself
 * and all nodes of right subtree are more than itself),
 * find the lowest common ancestor (LCA) of two given nodes in the BST.
 * According to the definition of LCA on Wikipedia: 
 * “The lowest common ancestor is defined between two nodes v and w 
 * as the lowest node in T that has both v and w as descendants 
 * (where we allow a node to be a descendant of itself).”
 * 
 * For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. 
 * Another example is LCA of nodes 2 and 4 is 2, 
 * since a node can be a descendant of itself according to the LCA definition.
 *       _______6_______
 *      /               \
 *   ___2___          ___8___
 *  /       \        /       \
 * 0       _4_      7        9
 *        /   \
 *       3    5
 *
 *
 * @see testutils.TreeNode
 */
public class LowestCommonAncestorofaBinarySearchTree {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	//这是针对BST(二叉搜索树)的实现方法
		if (root == null || p == null || q == null) return null;
		//三者任意为空, 则结果为空
		if (p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
		//两者都小于根节点, 证明两者均在左子树中
		if (p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right, p, q);
		//两者都大于根节点, 证明两者均在右子树中
		if (Math.max(p.val, q.val) >= root.val && Math.min(p.val, q.val) <= root.val) return root;
		//如果两者中有一个等于根节点, 则证明是根节点
		return root;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TreeNode root = TreeNode.generateTestCase("8,4,15,3,6,10,17,1,null,5,7,null,null,16,20");
		TreeNode p = new TreeNode(10);
		TreeNode q = new TreeNode(17);
		int val = new LowestCommonAncestorofaBinarySearchTree().lowestCommonAncestor(root, p, q).val;
		System.out.println(val);
	}

}
