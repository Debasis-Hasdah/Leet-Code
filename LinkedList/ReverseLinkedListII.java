public class ReverseLinkedListII {

   
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        // Create a dummy node to simplify edge case where left = 1
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // prev = node right before starting position
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // curr will be the first node to reverse
        ListNode curr = prev.next;
        ListNode nextNode = null;

        // Reverse [left, right]
        for (int i = 0; i < right - left; i++) {
            nextNode = curr.next;
            curr.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
        }

        return dummy.next;
    }

    public static ListNode buildList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode tail = head;
        for (int i = 1; i < arr.length; i++) {
            tail.next = new ListNode(arr[i]);
            tail = tail.next;
        }
        return head;
    }

    
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode list = buildList(new int[]{1, 2, 3, 4, 5});
        System.out.println("Original List:");
        printList(list);

        int left = 2, right = 4;
        ListNode result = reverseBetween(list, left, right);

        System.out.println("\nAfter reversing from " + left + " to " + right + ":");
        printList(result);  // Output: 1 -> 4 -> 3 -> 2 -> 5 -> null
    }
}
