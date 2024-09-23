package LinkedLists;

public class IntersectingLinkedLists {
    // Consider an approach such way: do a default check without iterating
    // the LL, if they are same return the same node. check if they have the
    // same end node (same node not value) if they don't, return null;
    // Gray out a few nodes


    // method to find the intersecting node.
    //    Time - O(N) and Space - O(1)
    public static LinkedList.Node isIntersecting(LinkedList.Node l1, LinkedList.Node l2){
        if (l1 == null) throw new IllegalArgumentException();
        if (l2 == null) throw new IllegalArgumentException();
        LinkedList.Node current1 = l1, current2 = l2;
        while(current1 != current2){
            if (current1 == null && current2 == null) return null;
            else if (current1 == null) current1 = l2;
            else if (current2 == null) current2 = l1;
            else{
                current1 = current1.next;
                current2 = current2.next;
            }
        }

        return current1;
    }
}
