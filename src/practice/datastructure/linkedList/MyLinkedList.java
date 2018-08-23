package practice.datastructure.linkedList;

public class MyLinkedList<S> {
    private Node head=null;
    private int size=0;


    public void add(S element){
        Node newNode = new Node(element);

        if(head==null){
            head = newNode;
        }
            else {
            Node temp = head;
            newNode.setNext(temp);
            head = newNode;

        }
        size++;
    }


    public String printList(){
        StringBuffer buffer = new StringBuffer();
        Node current=head;
        if(current==null){
            return "list is empty";
        }
        while(current.getNext()!=null){
            buffer.append(current.getElement());
            buffer.append("-->");
            current= current.getNext();
        }
        return buffer.append(current.getElement()).toString();
    }

    public Node getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }
}
