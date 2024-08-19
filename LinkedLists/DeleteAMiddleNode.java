package LinkedLists;

public class DeleteAMiddleNode {
    public static void deleteMiddleNode(LinkedList.Node head){
        // assuming the LL would always be a valid case and the node to delete won't be the last node of the LL
        // FYI that this logic won't work for the first node as well.
        // in case if we want to delete the first node of the LL, then we simply do: return head.next.
        LinkedList.Node nextNode = head.next;
        head.value = nextNode.value;
        head.next = nextNode.next;
    }
}
