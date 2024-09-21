package LinkedLists;

import java.util.Stack;

public class Palindrome {
    public static boolean isPalindromeUsingRunnerTechnique(LinkedList.Node head){
        //Time - O(N) as we traverse the LL exactly once using the slow pointer.
        //Space - O(N) as the stack size could grow to N/2.
        if (head == null) throw new IllegalArgumentException();
        if (head.next == null) return true;
        Stack<Integer> stack = new Stack<>();
        LinkedList.Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            stack.add(slow.value);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) slow = slow.next;

        while(slow != null){
            if (stack.pop() != slow.value) return false;
            slow = slow.next;
        }
        return true;
    }

    public static boolean isPalindromeCompareWhole(LinkedList.Node head){
        // Time = O(N) as we traverse the LL twice in a single loop.
        // Space = O(N) as we use another LL to reverse the LL.
        if (head == null) throw new IllegalArgumentException();
        LinkedList.Node current = head, reverse = reverseLinkedList(current);
        while(head != null && reverse != null){
            if (head.value != reverse.value) return false;
            head = head.next;
            reverse = reverse.next;
        }
        return head == null && reverse == null;
    }

    public static LinkedList.Node reverseLinkedList(LinkedList.Node head){
        LinkedList.Node result = null;
        while(head != null){
            LinkedList.Node node = new LinkedList.Node(head.value);
            node.next = result;
            result = node;
            head = head.next;
        }
        return result;
    }
}
