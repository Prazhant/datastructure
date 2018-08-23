package practice.datastructure.linkedList;

public class Node<S> {

    private S s;
    private Node next;

    public Node(S element) {
        this.s=element;
    }

    public S getElement() {
        return s;
    }

    public void setElement(S element) {
        this.s = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
