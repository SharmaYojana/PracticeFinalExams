package nyc.c4q.Yojana;

/**
 * Created by yojanasharma on 2/11/17.
 */
public class Node {
   int data;
    Node Next;

    public Node(int data, Node next) {
        this.data = data;
        Next = next;
    }

    public Node(int data) {
        this.data = data;

    }
}
