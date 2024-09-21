package LinkedLists;

import java.util.List;

public class SumLists {
// sum lists forward IMPL is still yet to be done. Cover back this topic after
// doing recursion topic.
    public static LinkedList.Node result = new LinkedList.Node(-1);
    public static int carry = 0;
    public static void sumLists(LinkedList.Node l1, LinkedList.Node l2){
        LinkedList.Node result = new LinkedList.Node(-1), current = result;
        int carry = 0;
        while(l1 != null || l2 != null){
            int sum = carry;
            if (l1 != null){
                sum += l1.value;
                l1 = l1.next;
            }
            if (l2 != null){
                sum += l2.value;
                l2 = l2.next;
            }
            current.next = new LinkedList.Node(sum % 10);
            current = current.next;
            carry = sum / 10;
        }
        if (carry > 0) current.next = new LinkedList.Node(carry);
        LinkedList.print(result.next);
    }

    public static void sumListsForward(LinkedList.Node l1, LinkedList.Node l2){
        if (l1 == null || l2 == null) throw new IllegalArgumentException();

        LinkedList.Node current1 = l1, current2 = l2;

        int length1 = lengthOfLinkedList(current1);
        int length2 = lengthOfLinkedList(current2);

        if (length1 > length2){
            l2 = padList(current2, length1 - length2);
        }else if(length2 > length1){
            l1 = padList(current1, length2 - length1);
        }

        current1 = l1;
        addListHelper(l1, l2, carry);

        LinkedList.Node carryNode = new LinkedList.Node(carry);
        if(carry > 0){

            carryNode.next = current1;
        }
        LinkedList.print(carryNode);
    }

    public static int addListHelper(LinkedList.Node l1, LinkedList.Node l2, int carry){
        if (l1.next != null){
            return addListHelper(l1.next, l2.next, carry);
        }
        int sum = l1.value + l2.value + carry;
        l1.value = sum % 10;
        carry = sum / 10;
        return carry;
    }

    public static LinkedList.Node padList(LinkedList.Node head, int padding){
        for(int i = 1; i <= padding; i++){
            head = new LinkedList.Node(0, head);
        }
        return head;
    }

    public static int lengthOfLinkedList(LinkedList.Node head){
        int length = 0;
        while(head != null){
            length += 1;
            head = head.next;
        }
        return length;
    }
}