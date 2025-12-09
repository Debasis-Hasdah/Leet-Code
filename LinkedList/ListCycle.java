  //Linked List
  
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
public class ListCycle {
public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow == fast)
                return true;

            slow = slow.next;       // move 1 step
            fast = fast.next.next;  // move 2 steps
        }
        return false;
    
    }
      public static void main(String[] args) {

        // Example 1: [3,2,0,-4], pos = 1
        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(0);
        head1.next.next.next = new ListNode(-4);

        // create cycle: tail -> index 1 (node with value 2)
        head1.next.next.next.next = head1.next;

        System.out.println("Example 1: " + hasCycle(head1)); // true


        // Example 2: [1,2], pos = 0
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);

        // create cycle: tail -> index 0
        head2.next.next = head2;

        System.out.println("Example 2: " + hasCycle(head2)); // true


        // Example 3: [1], pos = -1
        ListNode head3 = new ListNode(1);

        System.out.println("Example 3: " + hasCycle(head3)); // false

 }
}