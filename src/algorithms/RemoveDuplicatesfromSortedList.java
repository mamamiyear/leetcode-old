/**
 * 
 */
package algorithms;

import testutils.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mamamiyear
 * @date 2015年10月22日
 * 
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 *
 * @see ListNode
 */
public class RemoveDuplicatesfromSortedList {
	
	public ListNode deleteDuplicates(ListNode head) {
		
		if(head != null) {
			ListNode result = new ListNode(head.val);
			ListNode currentLast = result;
			ListNode currentNode = head.next;
			Set<Integer> set = new HashSet<Integer>();
			set.add(result.val);
			while(currentNode != null) {
				Integer currentVlaue = currentNode.val;
				if(!set.contains(currentVlaue)) {
					set.add(currentVlaue);
					currentLast.next = new ListNode(currentNode.val);
					currentLast = currentLast.next;
				}
				currentNode = currentNode.next;
			}
			
			return result;
		} else return null;
		
        
    }

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ListNode head = ListNode.createList("1,2,2,4,16,68,,81,6,35,516,4,68,681,61,,681");
		System.out.println("原始list为：");
		ListNode temp = head;
		while(temp != null) {
			if(temp.next == null) System.out.print(temp.val);
			else System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.println();
		ListNode root = new RemoveDuplicatesfromSortedList().deleteDuplicates(head);
		System.out.println("去重后list为：");
		while(root != null) {
			if(root.next == null) System.out.print(root.val);
			else System.out.print(root.val + "->");
			root = root.next;
		}
	}

}
