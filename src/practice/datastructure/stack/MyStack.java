package practice.datastructure.stack;

import practice.datastructure.linkedList.MyLinkedList;
import practice.datastructure.linkedList.Node;

public class MyStack<S> {
    private int count;
    private Node<S> head=null;


    public void push(S element) {
        Node node = new Node(element);
        if(head==null){
            head = node;
        }else{
            Node temp = head;
            node.setNext(temp);
            head = node;
        }
        count++;
    }

    public S pop() throws Exception {
        if(head==null){
            throw new Exception("The List is empty");
        };
        Node temp = head;
        S value = (S) temp.getElement();
        head=head.getNext();
        temp=null;
        return value;
    }

}
