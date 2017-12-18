package algorithms.medium;

import testutils.ListNode;

/**
 * @author mamamiyear
 *         on 2016/1/27
 *
 * Given a singly linked list, group all odd nodes together followed by the even nodes.
 * Please note here we are talking about the node number and not the value in the nodes.
 * You should try to do it in place.
 * The program should run in O(1) space complexity and O(nodes) time complexity.
 *
 * Example:
 * Given 1->2->3->4->5->NULL,
 * return 1->3->5->2->4->NULL.
 *
 * Note:
 * The relative order inside both the even and odd groups should remain as it was in the input.
 * The first node is considered odd, the second node even and so on ...
 */
public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null) return head;
        ListNode oddList = head;
        ListNode evenList = head.next;
        ListNode evenHead = head.next;
        while (oddList.next != null && evenList.next != null) {
            oddList.next = oddList.next.next;
            evenList.next = evenList.next.next;
            oddList = oddList.next;
            evenList = evenList.next;
        }
        oddList.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.createList("1,2,3,4,5");
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if(temp.next != null) System.out.print("->");
            else System.out.println();
            temp = temp.next;
        }

        ListNode result = new OddEvenLinkedList().oddEvenList(head);
        while (result != null) {
            System.out.print(result.val);
            if(result.next != null) System.out.print("->");
            else System.out.println();
            result = result.next;
        }

    }

}
