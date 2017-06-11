/**
 * 
 */
package algorithms;

import testutils.ListNode;

/**
 * @author mamamiyear
 * @date 2015年10月13日
 * 
 * Write a function to delete a node (except the tail) in a singly linked list, 
 * given only access to that node.
 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node 
 * with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.
 *
 * @see ListNode
 */
public class DeleteNodeinaLinkedList {
	
	public void deleteNode(ListNode node) {
		
		node.val = node.next.val;
		node.next = node.next.next;
        
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
