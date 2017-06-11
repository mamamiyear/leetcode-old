package algorithms;

import testutils.ListNode;

/**
 * @author mamamiyear
 *         on 2015/12/5
 *
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode first = l1;
        ListNode tempL1Current = l1;
        ListNode tempL1Before = null;
        ListNode tempL2Current = l2;
        ListNode tempL2temp = l2;

        boolean notFinished = true;

        while (tempL2Current != null) {

            while (tempL1Current.val <= tempL2Current.val) {
                if (tempL1Current.next != null) {
                    tempL1Before = tempL1Current;
                    tempL1Current = tempL1Current.next;
                } else {
                    System.out.println("L1已经到最后，最后值为：" + tempL1Current.val);
                    System.out.println("此时L2执行到的值为：" + tempL2Current.val);
                    System.out.println("此时L2执行到的下一个值为：" + tempL2Current.next.val);
                    tempL1Current.next = tempL2Current;
                    notFinished = false;
                    break;
                }
            }
            if(!notFinished) break;
            if (tempL1Before != null) {
                tempL1Before.next = tempL2Current;
            } else {
                first = tempL2Current;
            }
            tempL2temp = new ListNode(tempL2Current.val);
            tempL2temp.next = tempL2Current.next;
            tempL2Current.next = tempL1Current;
            tempL1Before = tempL2Current;
            tempL2Current = tempL2temp.next;

        }
        return first;
    }

    public static void main(String[] args) {
        ListNode l1 = ListNode.createList("1,2,4,16,19,27");
        ListNode l2 = ListNode.createList("0,3,8,28,29,30");
        System.out.print("l1为：" + l1.val + "->");
        ListNode temp = l1;
        while (temp.next != null) {
            System.out.print(temp.next.val + "->");
            temp = temp.next;
        }
        System.out.println();
        System.out.print("l2为：" + l2.val + "->");
        temp = l2;
        while (temp.next != null) {
            System.out.print(temp.next.val + "->");
            temp = temp.next;
        }
        System.out.println();

        MergeTwoSortedLists merge = new MergeTwoSortedLists();
        ListNode result = merge.mergeTwoLists(l1, l2);
        System.out.print("结果为：" + result.val + "->");
        temp = result;
        int i = 0;
        while (temp.next != null) {
            System.out.print(temp.next.val + "->");
            temp = temp.next;
            i++;
        }
    }

}
