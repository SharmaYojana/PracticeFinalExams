package nyc.c4q.Yojana;

/**
 * Created by yojanasharma on 2/11/17.
 */
public class LinkedList {
    Node head;
    int size;

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Node(10));

//        linkedList.head = new Node (10);
        System.out.println(linkedList.head.data);


    }

    public void add(Node addedNode) {
        Node tempNode;
        if (head == null) {
            head = addedNode;
            return;
        }
        tempNode = head;

        while (tempNode != null) {
            tempNode = tempNode.Next;
        }
        tempNode = addedNode;

    }

}
