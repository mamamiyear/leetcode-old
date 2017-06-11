package algorithms;

import testutils.ListNode;

/**
 * @author mamamiyear
 *         on 2016/5/11
 *
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 *
 * Your algorithm should use only constant space.
 * You may not modify the values in the list, only nodes itself can be changed.
 */
public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode myHead = head.next, beforePair = null;
        while (head != null && head.next != null) {
            ListNode next = head.next, nextPair = head.next.next;
            next.next = head;
            head.next = nextPair;
            if (beforePair != null)
                beforePair.next = next;
            beforePair = head;
            head = nextPair;
        }
        return myHead;
    }

    public static void main(String[] args) {
        ListNode testcase = ListNode.createList("1,2");
        SwapNodesinPairs swapNodesinPairs = new SwapNodesinPairs();
        ListNode res = swapNodesinPairs.swapPairs(testcase);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
