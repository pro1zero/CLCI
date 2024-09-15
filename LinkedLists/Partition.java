package LinkedLists;

import java.util.TreeSet;

public class Partition {

    // This method is O(N) time where N is the number of nodes in the LL.
    // This is O(N) space as we use a set to store all the elements as well the result LL.
    public static void partitionLLUsingTreeSet(LinkedList.Node head, int pivot){
        if (head == null) throw new IllegalArgumentException();

        TreeSet<Integer> set = new TreeSet<>();
        LinkedList.Node current = head;
        while(current != null){
            set.add(current.value);
            current = current.next;
        }
        LinkedList.Node result = new LinkedList.Node(-1);
        current = result;
        for(int num: set){
            current.next = new LinkedList.Node(num);
            current = current.next;
        }
        LinkedList.print(result.next);
    }

    public static void partitionLLEfficient(LinkedList.Node head, int pivot){
        if (head == null) throw new IllegalArgumentException();

        LinkedList.Node smallerElements = new LinkedList.Node(Integer.MIN_VALUE), currentSmall = smallerElements;
        LinkedList.Node biggerElements = new LinkedList.Node(Integer.MAX_VALUE), currentBig = biggerElements;

        while(head != null){
            if (head.value < pivot){
                currentSmall.next = new LinkedList.Node(head.value);
                currentSmall = currentSmall.next;
            }else{
                currentBig.next = new LinkedList.Node(head.value);
                currentBig = currentBig.next;
            }
            head = head.next;
        }
        currentSmall.next = biggerElements.next;
        LinkedList.print(smallerElements.next);
    }









}
