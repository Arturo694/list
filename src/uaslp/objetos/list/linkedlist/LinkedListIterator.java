package uaslp.objetos.list.linkedlist;

public class LinkedListIterator {

    private Node currentNode;

    LinkedListIterator (Node head) {
        currentNode = head;
    }

    public boolean hashNext () {
        return currentNode != null;
    }

    public String next () {
        String data = currentNode.data;

        currentNode = currentNode.next;

        return data;
    }


}
