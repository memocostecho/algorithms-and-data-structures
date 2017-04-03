public class Node<K> {


    private K value;
    private Node next;


    public Node(K value, Node next) {
        this.value = value;
        this.next = next;
    }

    ;

    public Node getNext() {
        return this.next;

    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setValue(K value) {
        this.value = value;
    }

    public K getValue() {

        return this.value;
    }


}
