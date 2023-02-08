
import uaslp.objetos.list.linkedlist.LinkedList;
import uaslp.objetos.list.linkedlist.LinkedListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        System.out.println(linkedList.getSize());

        LinkedListIterator iterator = linkedList.getIterator();
        while(iterator.hashNext()){
            String data = iterator.next();
        }
    }
}