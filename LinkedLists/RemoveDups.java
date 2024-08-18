package LinkedLists;

import java.util.HashSet;

public class RemoveDups {
    public static void removeDupsUsingSet(LinkedList.Node head){
        if (head == null) throw new IllegalArgumentException();
        LinkedList.Node current = head, prev = null;
        HashSet<Integer> set = new HashSet<>();
        while(current != null){
            if (set.contains(current.value)){
                prev.next = current.next;
            }else{
                set.add(current.value);
                prev = current;
            }
            current = current.next;
        }
        LinkedList.print(head);
    }

    public static void deleteDupsNested(LinkedList.Node head){
        if (head == null) throw new IllegalArgumentException();
        LinkedList.Node current = head;
        while(current != null){
            LinkedList.Node forward = current;
            while(forward.next != null){
                if (forward.next.value == current.value){
                    forward.next = forward.next.next;
                }
                else forward = forward.next;
            }
            current = current.next;
        }
        LinkedList.print(head);
    }
}
