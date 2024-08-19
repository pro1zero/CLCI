package LinkedLists;

public class KthtoLast {
    // assuming k would always be valid.
    // Design Specn: k = 1 would return the last element, k = 2 would return the second-last and so on.
    public static int kthToLast(LinkedList.Node head, int k){
        if (head == null) throw new IllegalArgumentException();
        LinkedList.Node slow = head, fast = head;
        while(k > 0){
            fast = fast.next;
            k -= 1;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow.value;
    }
}
