/**
 * 
 */
package algorithms;

import testutils.ListNode;

/**
 * @author mamamiyear
 * @date 2015年10月26日
 * 
 * Reverse a linked list.
 *
 * @see ListNode
 */
public class ReverseLinkedList {
	
	public ListNode reverseList(ListNode head) {
        
		ListNode result = null;
		ListNode next = null;
		while(head != null) {
			result = new ListNode(head.val);
			result.next = next;
			next = result;
			head = head.next;
		}
		return result;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ListNode testHead = ListNode.createList("1,2,15,27,31,8,9");
		ListNode result = new ReverseLinkedList().reverseList(testHead);
		while(result != null) {
			if(result.next != null) System.out.print(result.val + "->");
			else System.out.println(result.val);
			result = result.next;
		}
	}

}
