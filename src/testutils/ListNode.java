/**
 *
 */
package testutils;

import java.util.stream.Stream;


/**
 * @author mamamiyear
 * @date 2015年10月22日
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode createList(String s) {
        if (s == null || "".equals(s.trim())) return null;
        Object[] srr = Stream.of(s.split(",")).filter(x -> !ListNode.canParseToInt(x)).toArray();
        if (srr.length != 0) {
            System.out.print("无效输入：" + srr.length + "个. 分别为： ");
            for (Object sr : srr) {
                if ("".equals(sr.toString().trim())) System.out.print("' '" + " ");
                else System.out.print(sr + " ");
            }
            System.out.println();
        }
        int[] arr = Stream.of(s.split(",")).filter(ListNode::canParseToInt).mapToInt(x -> Integer.parseInt(x.trim())).toArray();
        if (arr == null || arr.length == 0) return null;
        ListNode root = new ListNode(Integer.MAX_VALUE);
        ListNode currentNode = root;
        for (int i = 0; i < arr.length; i++) {
            currentNode.val = arr[i];
            if (i != arr.length - 1) {
                currentNode.next = new ListNode(Integer.MAX_VALUE);
                currentNode = currentNode.next;
            }
        }
        return root;
    }

    private static boolean canParseToInt(String s) {
        try {
            Integer.parseInt(s.trim());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public ListNode addToTail(ListNode node) {
        ListNode current = this;
        while (current.next != null) current = current.next;
        current.next = node;
        return this;
    }

    public ListNode removeOneNodeByValue(int val) {
        ListNode pre = null;
        ListNode current = this;
        while (current != null) {
            if (current.val == val) {
                if (pre != null) pre.next = current.next;
                else if (current.next != null) {
                    this.val = current.next.val;
                    this.next = current.next.next;
                } else return null;
                break;
            }
            pre = current;
            current = current.next;
        }
        return this;
    }

    public ListNode removeNodesByValue(int val) {
        ListNode pre = null;
        ListNode current = this;
        while (current != null) {
            if (current.val == val) {
                if (pre != null) pre.next = current.next;
                else if (current.next != null) {
                    this.val = current.next.val;
                    this.next = current.next.next;
                } else return null;
            }
            pre = current;
            current = current.next;
        }
        return this;
    }

    public void deleteNodeByNode(ListNode delNode) {
        ListNode head = this;
        if (delNode.next == null) {
            while (head.next != delNode) {
                head = head.next;
            }
            head.next = null;
            return;
        }
        ListNode temp = delNode.next;
        delNode.val = temp.val;
        delNode.next = temp.next;
        delNode = null;
    }

    public ListNode getOneNodeByValue(int val) {
        ListNode current = this;
        while (current != null) {
            if (current.val == val) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public int getLength() {
        ListNode head = this;
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public void printList() {
        ListNode current = this;
        while (current != null) {
            if (current.next != null) System.out.print(current.val + "->");
            else System.out.print(current.val);
            current = current.next;
        }
        System.out.println();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        
        ListNode root = ListNode.createList("1,2,a,4,16,68,,-2147483649,6,35,516,4,68,681,61,,682");
        ListNode cu = root;
        root.addToTail(new ListNode(100));
        while (cu != null) {
            if (cu.next == null) System.out.print(cu.val);
            else System.out.print(cu.val + "->");
            cu = cu.next;
        }

        System.out.println();
        cu = root;
        cu.removeOneNodeByValue(6);
        while (cu != null) {
            if (cu.next == null) System.out.print(cu.val);
            else System.out.print(cu.val + "->");
            cu = cu.next;
        }
        System.out.println();
        cu = root;
        cu.removeNodesByValue(68);
        while (cu != null) {
            if (cu.next == null) System.out.print(cu.val);
            else System.out.print(cu.val + "->");
            cu = cu.next;
        }

    }

}
