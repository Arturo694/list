package uaslp.objetos.list.linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public void addAtTail (String data) {
        Node node = new Node();

        node.data = data;
        node.previous = tail;

        if (head == null) {
            head = node;
        }
        else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    public void addAtFront (String data) {
        Node node = new Node();

        node.data = data;
        node.next = head;

        if(tail == null) {
            tail = node;
        }
        else{
            head.previous = node;
        }
        head = node;
        size++;
    }

    public void remove (int index) {
        Node aux = head;

        Node aux2;

        for(int currentIndex = 0; currentIndex < index; currentIndex++){
            aux2 = aux.previous;

            aux = aux.next;
        }
        aux2 = aux.previous;
    }

    public void setAt (int index, String data) {
        Node currentNode = head;

        for(int currentIndex=0; currentIndex < index; currentIndex++) {
            if (currentNode.data == data) {
            }
            else {
                currentNode = currentNode.next;
            }
        }
    }

    public void removeAllWithValue (String data) {

    }

    public String getAt (int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        Node currentNode = head;

        for (int currentIndex = 0; currentIndex < index; currentIndex++) {
            currentNode = currentNode.next;
        }

        return currentNode.data;
    }

    public int getSize() {
        return size;
    }

    public LinkedListIterator getIterator () {
        return new LinkedListIterator(head);
    }
}
