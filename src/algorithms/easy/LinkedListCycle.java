package algorithms.easy;

import testutils.ListNode;

import java.util.HashSet;

/**
 * @author mamamiyear
 *         on 2016/5/11
 *         <p>
 *         Given a linked list, determine if it has a cycle in it.
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<>();
        while (head != null) {
            if (hashSet.contains(head)) return true;
            else {
                hashSet.add(head);
                head = head.next;
            }
        }
        return false;
    }

    public boolean hasCycleByother(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head, fast = head.next.next;
        // if "fast" is null, there is no circle
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }

}
