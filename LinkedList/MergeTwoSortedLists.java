public class MergeTwoSortedLists {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

    // Merge two sorted linked lists, returning head of merged list
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Traverse both lists, picking smaller node each time
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Attach the remaining part (if any)
        if (l1 != null) current.next = l1;
        else if (l2 != null) current.next = l2;

        return dummy.next;
    }

    // Utility to build a list from array (for testing)
    public static ListNode buildList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        return head;
    }

    // Utility to convert list to string for printing
    public static String listToString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode cur = head;
        while (cur != null) {
            sb.append(cur.val);
            if (cur.next != null) sb.append(" -> ");
            cur = cur.next;
        }
        return sb.toString();
    }

    // Main method to test
    public static void main(String[] args) {
        ListNode l1 = buildList(new int[]{1, 2, 4});
        ListNode l2 = buildList(new int[]{1, 3, 4});

        System.out.println("List1: " + listToString(l1));
        System.out.println("List2: " + listToString(l2));

        ListNode merged = mergeTwoLists(l1, l2);

        System.out.println("Merged: " + listToString(merged));
        // Expected: 1 → 1 → 2 → 3 → 4 → 4
    }
}
