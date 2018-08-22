package practice.datastructure.lru;

public class Node {
    private int key;
    private int value;
    private Node prev;
    private Node after;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getAfter() {
        return after;
    }

    public void setAfter(Node after) {
        this.after = after;
    }
}
